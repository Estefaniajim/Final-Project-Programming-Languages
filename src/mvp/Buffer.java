package mvp;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.table.DefaultTableModel;


public class Buffer {
	public Queue<String> buffer;
	public int numero, completados;
	public int ProductorNum, ConsumidorNum;
	static int count = 1;
	private GUIDesignFrame gui;
	
	
	// Constructor
	public Buffer(int numero, int ProductorNum, int ConsumidorNum, GUIDesignFrame gui) {
		this.numero = numero;
		this.ProductorNum = ProductorNum;
		this.ConsumidorNum = ConsumidorNum;
		this.buffer = new LinkedList<>();
		this.completados = 0;
		this.gui = gui;
	}
	
	// Producir hilo
	 synchronized void producir(String input) {
		 // Si el buffer ya llego a maxima capacidad
		 while(bufferMaximaCapacidad()) {
			 try {
				 wait(this.ProductorNum);
			 }
			 catch(InterruptedException e){
				 System.out.println(e);
			 }
		 }
		 
		 this.agregarInput(input);
		 try{
	            DefaultTableModel model = (DefaultTableModel) gui.jTable1.getModel();
	            model.addRow(new Object[]{input});
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }

	        gui.labelTareasPendientes.setText(this.buffer.size() + "");
	        
		 notify();
	 }
	 
	 // Consumir hilo
	 synchronized String consumir() {
		 String input = "";
		 
		 // Si el buffer esta vacio
		 while(this.buffer.isEmpty()) {
			 try {
				 wait(this.ProductorNum);
	         }
			 catch (InterruptedException e) {
				 System.out.println(e);
	         }
	      }
		 
		 // Hacer la operacion de Scheme
		 input = this.agarrarInput();
	     this.completados++;
	        try{
	            DefaultTableModel model1 = (DefaultTableModel) gui.jTable1.getModel();
	            model1.removeRow(0);
	        } catch (Exception e){
	            System.out.println(e);
	        }
	     gui.labelTareasPendientes.setText(this.buffer.size() + "");
	     input = input.substring(1, input.length()-1);
	     String[] operaciones = input.split(" ");
	     Double resultado = 0.0; 
	     switch(operaciones[0]){
	     	case "+":
	     		resultado = Double.parseDouble(operaciones[1]) + Double.parseDouble(operaciones[2]);
	     		break;
	     	case "-":
	     		resultado = Double.parseDouble(operaciones[1]) - Double.parseDouble(operaciones[2]);
	     		break;
	     	case "*":
	     		resultado = Double.parseDouble(operaciones[1]) * Double.parseDouble(operaciones[2]);
	     		break;
	     	case "/":
	     		resultado = Double.parseDouble(operaciones[1]) / Double.parseDouble(operaciones[2]);
	     		break;
         }
	      
	     String output = resultado.toString();
	     try{
	            DefaultTableModel model2 = (DefaultTableModel) gui.jTable2.getModel();
	            model2.addRow(new Object[]{input, output});
	        } catch (Exception e){
	            System.out.println(e);
	        }

	     gui.labelTareasCompletadas.setText(this.completados + "");
	     notify();
	     return input + " = " + output;
	  }


	 
	 private String agregarInput(String input) {
		 if(this.buffer.size() < this.numero) {
			 this.buffer.add(input);
			 return input;
	    }
		 return null;
	  }
	 
	 
	private String agarrarInput() {
		if(!this.buffer.isEmpty()) {
			 return this.buffer.remove();
		 }
		return null;
	}
	
	private boolean bufferMaximaCapacidad() {
		return this.buffer.size() >= this.numero;
	}
	
}

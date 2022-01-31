package mvp;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	public Queue<String> buffer;
	public int numero, completados;
	public int ProductorNum, ConsumidorNum;
	static int count = 1;
	
	// Constructor
	public Buffer(int numero, int ProductorNum, int ConsumidorNum) {
		this.numero = numero;
		this.ProductorNum = ProductorNum;
		this.ConsumidorNum = ConsumidorNum;
		this.buffer = new LinkedList<>();
		this.completados = 0;
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
		 this.printBuffer();
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
	     this.printBuffer();
	     notify();
	     return input+" = "+output;
	  }

	 synchronized static void print(String string) {
		 System.out.print(count++ + " ");
	     System.out.println(string);
	 }
	 
	 private String agregarInput(String input) {
		 if(this.buffer.size() < this.numero) {
			 this.buffer.add(input);
			 return input;
	    }
		 return null;
	  }
	 
	 private void printBuffer() {
		 String output = "[";
		 for(String c : this.buffer) {
			 output += c + ", ";
		 }
		 output += "]";
		 System.out.println(output);
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

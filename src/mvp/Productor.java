package mvp;

import java.util.Random;

public class Productor extends Thread {
	Buffer buffer;
	public int tiempoDeEsperaProductor;
	private boolean activo;
	public int tiempoMax;
	public int tiempoMin;
	final Character[] operaciones = {'+', '-', '*', '/'};
	
	public Productor(Buffer buffer, int tiempoDeEspera, int tiempoMin, int tiempoMax) {
        this.buffer = buffer;
        this.tiempoDeEsperaProductor = tiempoDeEspera;
        this.activo = false;
        this.tiempoMax = tiempoMax;
        this.tiempoMin = tiempoMin;
    }

	@Override
	public void run() {
		this.activo = true;
	
		String input;
		
		while(activo) {
			Random r = new Random(System.nanoTime());
			String operacion = operaciones[r.nextInt(operaciones.length)].toString();
			String primera = ((Integer)(tiempoMin + r.nextInt(tiempoMax - tiempoMin))).toString();
			String segunda = ((Integer)(tiempoMin + r.nextInt(tiempoMax - tiempoMin))).toString();
			input = "(" + operacion + " " + primera + " " + segunda + ")";
			this.buffer.producir(input);
			
			try {
                Thread.sleep(this.tiempoDeEsperaProductor);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
		}
	}
	
	public void kill() {
		this.activo = false;
	}

}

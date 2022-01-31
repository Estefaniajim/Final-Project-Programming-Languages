package mvp;


public class Consumidor extends Thread{
	Buffer buffer;
	public int tiempoEsperaConsumidor;
	private boolean activo;
	
	public Consumidor(Buffer buffer, int tiempoEsperaConsumidor) {
		this.buffer = buffer;
		this.tiempoEsperaConsumidor = tiempoEsperaConsumidor;
		this.activo = false;
	}

	@Override
	public void run() {
		this.activo = true;
	    System.out.println("Consumidor corriendo ...");
	    String input;
	    
	    while(activo) {
	    	input = this.buffer.consumir();
	    	Buffer.print("Consumidor consumido: " + input);
	    	
            try {
                Thread.sleep(this.tiempoEsperaConsumidor);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
	    }
	}
	
	public void kill() {
		this.activo = false;
	}

}

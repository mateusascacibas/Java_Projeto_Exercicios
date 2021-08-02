package heranca;

public class Lampada {
	private boolean ligada;
	private String status;
	
	public Lampada() {
		this.ligada = true;
	}
	
	public void ligar() {
		if(this.ligada) {
			System.out.println("Lampada j� est� ligada!");
		}
		else {
			this.ligada = true;
		}
	}
	
	public void desligar() {
		if(!this.ligada) {
			System.out.println("Lampada j� est� desligada");
		}
		else {
			this.ligada = false;
		}
	}
	public void isLigada() {
		if(this.ligada) {
			status = "Ligada";
		}
		else {
			status = "Desligada";
		}
		System.out.println("Lampada atualmente est�: " +  status);
		
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
}

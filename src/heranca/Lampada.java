package heranca;

public class Lampada {
	private boolean ligada;
	private String status;
	
	public Lampada() {
		this.ligada = true;
	}
	
	public void ligar() {
		if(this.ligada) {
			System.out.println("Lampada ja está ligada!");
		}
		else {
			this.ligada = true;
		}
	}
	
	public void desligar() {
		if(!this.ligada) {
			System.out.println("Lampada ja esta desligada");
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
		System.out.println("Lampada atualmente esta: " +  status);
		
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
}

package heranca;

public class Elevador {
	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeElevador;
	private int pessoasDentro;
	
	public Elevador(int capacidadeElevador, int totalDeAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalDeAndares = totalDeAndares;
		this.andarAtual = 0;
		this.pessoasDentro = 0;
	}
	
	public void Entrar() {
		if(this.pessoasDentro < this.capacidadeElevador) {
			this.pessoasDentro += 1;
		}
		else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void Sair() {
		if(this.pessoasDentro > 0) {
			this.pessoasDentro -= 1;
		}
		else {
			System.out.println("Elevador já está vazio!");
		}
	}
	
	public void Subir() {
		if(this.andarAtual < this.totalDeAndares) {
			this.andarAtual += 1;
		}
		else {
			System.out.println("Elevador já está no ultimo andar!");
		}
	}
	
	public void Descer() {
		if(this.andarAtual > 0) {
			this.andarAtual -= 1;
		}
		else {
			System.out.println("Elevador já está no terreo!");
		}
	}
	
	public void getInformacoes() {
		System.out.println("Andar Atual: " + getAndarAtual() + "\nTotal de Andares: " + getTotalDeAndares() + "\nPessoas no elevador: " + getPessoasDentro() + "\nCapacidade: " + getCapacidadeElevador());
	}
	public int getTotalDeAndares() {
		return totalDeAndares;
	}
	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public int getPessoasDentro() {
		return pessoasDentro;
	}
	public void setPessoasDentro(int pessoasDentro) {
		this.pessoasDentro = pessoasDentro;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
}

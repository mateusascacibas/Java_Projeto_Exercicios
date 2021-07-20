package classes;

public class Funcionario {
	private int codFunc;
	private String nomeFunc;
	private double salarioMensal;
	
	public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
		this.codFunc = codFunc;
		this.nomeFunc = nomeFunc;
		this.salarioMensal = salarioMensal;
	}
	
	public Funcionario() {
		
	}
	
	public double getSalarioAnual() {
		return salarioMensal * 12;
	}
	
	public void setAumento(double per) {
		
		this.salarioMensal += salarioMensal * (per / 100.0) ; 
	}
	
	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}
	
	public int getCodFunc() {
		return codFunc;
	}
	
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
}

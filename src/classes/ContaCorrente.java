package classes;

public class ContaCorrente {
	private int numCC;
	private double saldoCC;
	
	public void depositar(double valor) {
		this.saldoCC += valor;
	}
	
	public void sacar(double valor) {
		this.saldoCC -= valor;
	}
	
	public void setSaldo(double valor) {
		this.saldoCC = valor;
	}
	
	public double getSaldo() {
		return this.saldoCC;
	}
	
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	public double getNumCC() {
		return this.numCC;
	}
}

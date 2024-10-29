package br.com.fiap.banco;

public class Conta {

	private String nomeCliente;
	private String cpfCliente;
	private long numeroConta;
	private double saldo;

	public Conta(long numeroConta, String nomeCliente, String cpfCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		System.out.println("Conta " + this.nomeCliente + " criada!");
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		this.saldo = saldo + valor;

	}

	public void transferir(Conta conta, double valor) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
	}

	public void exibirSaldo() {
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("--------");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

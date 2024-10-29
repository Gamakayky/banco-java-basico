package br.com.fiap.banco;

public class Conta {

	String nomeCliente;
	String cpfCliente;
	long numeroConta;
	double saldo;

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

}

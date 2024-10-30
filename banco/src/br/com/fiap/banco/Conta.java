package br.com.fiap.banco;

public class Conta {

	private long numeroConta;
	private double saldo;
	private Cliente cliente;

	public Conta(long numeroConta, double saldo, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
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
		System.out.println("Numero conta: " + this.numeroConta);
		System.out.println("Cliente: " + this.cliente.getNomeCliente());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("--------");
	}

}

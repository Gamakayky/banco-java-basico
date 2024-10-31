package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(long numeroConta, double saldo, Cliente cliente, String aberturaConta) {
		super(numeroConta, saldo, cliente, aberturaConta);

	}

	@Override
	public void exibirSaldo() {
		System.out.println("Numero conta: " + this.numeroConta);
		System.out.println("Cliente: " + this.cliente.getNomeCliente());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("--------");

	}

}

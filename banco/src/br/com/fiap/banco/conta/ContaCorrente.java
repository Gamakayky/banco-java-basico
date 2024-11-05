package br.com.fiap.banco.conta;

import br.com.fiap.banco.SaldoInsuficiente;
import br.com.fiap.banco.cliente.Cliente;
import br.com.fiap.banco.produto.Produto;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(long numeroConta, double saldo, Cliente cliente, String aberturaConta) {
		super(numeroConta, saldo, cliente, aberturaConta);

	}

	public void investimento(Produto produto, double valor) throws SaldoInsuficiente { // polimorfismo
		if (this.sacar(valor)) {
			saldoInvestimento += produto.investir(valor);
		}
	}

	@Override
	public void exibirSaldo() {
		System.out.println("=================================");
		System.out.println("Numero conta: " + this.numeroConta);
		System.out.println("Cliente: " + this.cliente.getNomeCliente());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Saldo investimento: " + this.saldoInvestimento);
		System.out.println("Saldo total: " + (this.saldo + this.saldoInvestimento));
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("=================================");
	}

}

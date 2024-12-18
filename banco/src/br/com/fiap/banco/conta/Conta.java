package br.com.fiap.banco.conta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.banco.SaldoInsuficiente;
import br.com.fiap.banco.cliente.Cliente;

public abstract class Conta {

	protected long numeroConta;
	protected double saldo;
	protected Cliente cliente;
	protected Date aberturaConta = new Date();

	public Conta(long numeroConta, double saldo, Cliente cliente, String aberturaConta) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = cliente;
		System.out.println("Conta " + this.cliente.getNomeCliente() + " criada!");
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			this.aberturaConta = format.parse(aberturaConta);
		} catch (ParseException e) {
			System.err.println("formato de data invalido: " + aberturaConta);
			e.printStackTrace();
		}
	}

	public boolean sacar(double valor) throws SaldoInsuficiente {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			throw new SaldoInsuficiente("Saldo insuficiente");
		}

	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
	}

	public abstract void exibirSaldo();

}

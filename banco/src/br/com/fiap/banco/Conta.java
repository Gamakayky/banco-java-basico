package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void transferir(Conta conta, double valor) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}
	}

	public abstract void exibirSaldo();

}

package br.com.fiap.banco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {

	private long numeroConta;
	private double saldo;
	private Cliente cliente;
	private Date aberturaConta = new Date();

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
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("--------");
	}

}

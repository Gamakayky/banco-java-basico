package br.com.fiap.banco;

public class SaldoInsuficiente extends Exception {

	public SaldoInsuficiente(String mensagem) {
		super(mensagem);
	}
}

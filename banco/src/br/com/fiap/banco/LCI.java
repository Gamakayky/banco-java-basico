package br.com.fiap.banco;

public class LCI implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.009);
	}

}

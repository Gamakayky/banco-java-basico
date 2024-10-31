package br.com.fiap.banco;

public class LCA implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.008);
	}

}

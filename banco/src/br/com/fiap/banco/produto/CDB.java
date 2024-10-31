package br.com.fiap.banco.produto;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.01);
	}

}

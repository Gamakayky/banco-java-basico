package br.com.fiap.banco;

public class CriaConta {

	public static void main(String[] args) {
		
		Cliente clienteKayky = new Cliente("kayky", 4556677, "rua sao paulo", "19/06/2020");
		Conta contaKayky = new Conta(1278574, 222, clienteKayky, "19/09/2019");
		contaKayky.depositar(1000);
		contaKayky.exibirSaldo();
		
	}

}

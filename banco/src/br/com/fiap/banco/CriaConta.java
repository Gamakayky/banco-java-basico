package br.com.fiap.banco;

public class CriaConta {

	public static void main(String[] args) {
		
		Cliente clienteKayky = new Cliente("kayky", 4556677, "rua sao paulo", null);
		Conta contaKayky = new Conta(1278574, 222, clienteKayky);
		contaKayky.depositar(1000);
		contaKayky.exibirSaldo();
		
	}

}

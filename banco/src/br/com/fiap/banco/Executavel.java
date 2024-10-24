package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {

		Conta contaKayky = new Conta();
		contaKayky.nomeCliente = "Kayky";
		Conta contaGama = new Conta();
		contaGama.nomeCliente = "Gama";

		contaKayky.depositar(10000);
		contaGama.depositar(10000);

		contaKayky.sacar(5000);
		contaGama.sacar(2000);

		contaKayky.exibirSaldo();
		contaGama.exibirSaldo();
		
		contaKayky.transferir(contaGama, 4999);
		
		contaKayky.sacar(10);
		
		contaKayky.exibirSaldo();
		contaGama.exibirSaldo();
		
		contaGama.transferir(contaKayky, 99);
		
		contaKayky.exibirSaldo();
		contaGama.exibirSaldo();
		

	}

}

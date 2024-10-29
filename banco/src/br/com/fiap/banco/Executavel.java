package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {

		Conta contaKayky = new Conta(00345, "Kayky gama", "47133467890");

		Conta contaFilipeGama = new Conta(45678, "filipe Gama", "22456789055");
		/*
		contaKayky.depositar(10000);
		contaFilipeGama.depositar(10000);

		contaKayky.sacar(5000);
		contaFilipeGama.sacar(2000);

		contaKayky.exibirSaldo();
		contaFilipeGama.exibirSaldo();

		contaKayky.transferir(contaFilipeGama, 4999);

		contaKayky.sacar(10);

		contaKayky.exibirSaldo();
		contaFilipeGama.exibirSaldo();

		contaFilipeGama.transferir(contaKayky, 99);

		contaKayky.exibirSaldo();
		contaFilipeGama.exibirSaldo();*/
		
		contaKayky.setSaldo(1000);
		double saldo = contaKayky.getSaldo();
		System.out.println(saldo);

	}

}

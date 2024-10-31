package br.com.fiap.banco;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.ContaCorrente;

public class CriaConta {

	public static void main(String[] args) {
		
		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();

		Cliente clienteKayky = new Cliente("kayky", 4556677, "rua sao paulo", "19/06/2020");
		ContaCorrente contaKayky = new ContaCorrente(1278574, 222, clienteKayky, "19/09/2019");

		contaKayky.depositar(10000);
		
		contaKayky.investimento(cdb, 10000);
		
		contaKayky.depositar(10000);
		
		contaKayky.investimento(lci, 9500);
		
		contaKayky.investimento(lca, 500);
		
		contaKayky.exibirSaldo();

	}

}

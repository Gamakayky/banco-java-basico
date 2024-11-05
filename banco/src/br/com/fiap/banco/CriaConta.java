package br.com.fiap.banco;

import br.com.fiap.banco.cliente.Cliente;
import br.com.fiap.banco.conta.ContaCorrente;
import br.com.fiap.banco.produto.CDB;
import br.com.fiap.banco.produto.LCA;
import br.com.fiap.banco.produto.LCI;

public class CriaConta {

	public static void main(String[] args) throws SaldoInsuficiente {

		CDB cdb = new CDB();
		LCA lca = new LCA();
		LCI lci = new LCI();

		Cliente clienteKayky = new Cliente("kayky", 4556677, "rua sao paulo", "19/06/2020");
		ContaCorrente contaKayky = new ContaCorrente(1278574, 222, clienteKayky, "19/09/2019");

		contaKayky.depositar(10000);

		contaKayky.investimento(cdb, 9000);

		contaKayky.depositar(10000);

		contaKayky.investimento(lci, 9500);

		contaKayky.investimento(lca, 500);

		contaKayky.exibirSaldo();
		try {
			contaKayky.investimento(cdb, 100);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}

		try {
			contaKayky.sacar(1000);
		} catch (SaldoInsuficiente e1) {
			e1.printStackTrace();
		}
	}

}

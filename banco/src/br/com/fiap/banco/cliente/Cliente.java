package br.com.fiap.banco.cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	// Attributes
	private String nomeCliente;
	private int cpfCliente;
	private String enderecoCliente;
	private Date dataNascCliente = new Date();

	// Constructor
	public Cliente(String nomeCliente, int cpfCliente, String enderecoCliente, String dataNascCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			this.dataNascCliente = format.parse(dataNascCliente);
		} catch (ParseException e) {
			System.err.println("formato de data invalido: " + dataNascCliente);
			e.printStackTrace();
		}
	}

	// getters setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public Date getDataNascCliente() {
		return dataNascCliente;
	}

	public void setDataNascCliente(Date dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}

}

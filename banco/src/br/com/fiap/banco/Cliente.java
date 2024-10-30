package br.com.fiap.banco;

import java.util.Date;

public class Cliente {

	// Attributes
	private String nomeCliente;
	private int cpfCliente;
	private String enderecoCliente;
	private Date dataNascCliente;

	// Constructor
	public Cliente(String nomeCliente, int cpfCliente, String enderecoCliente, Date dataNascCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.dataNascCliente = dataNascCliente;
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

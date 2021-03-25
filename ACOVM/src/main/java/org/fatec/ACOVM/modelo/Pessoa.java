package org.fatec.ACOVM.modelo;

public class Pessoa {
	private String nome;
	private String CPF;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	

}
//Pojo - plain old java object --> jpa trabalha com pojos para mapear tabelas 
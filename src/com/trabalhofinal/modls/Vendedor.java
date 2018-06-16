package com.trabalhofinal.modls;

import java.sql.Date;


public class Vendedor {
	private String nome;
	private String sobrenome;
	private String codigo;

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String sobrenome, String codigo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public static class Builder{
		private String nome;
		private String sobrenome;
		private String codigo;
		
		public Builder comNome(String nome){
			this.nome = nome;
			return this;
		}
		public Builder comSobrenome(String sobrenome){
			this.sobrenome = sobrenome;
			return this;
		}
		public Builder comCodigo(String codigo){
			this.codigo = codigo;
			return this;
		}
		public Vendedor create(){
			return new Vendedor(nome, sobrenome, codigo);
		}
		
	}
	
}

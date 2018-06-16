package com.trabalhofinal.modls;


public class Produto {
	private String codigo;
	private String nome;
	private String tipo;
	private int quantidade;
	private Double valor;
	
	// requisito da JAX-B
	public Produto() {
		super();
	}

	public Produto(String codigo, String nome, String tipo,
                   int quantidade, Double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	//Desing Pattern Builder
	public static class Builder{
		private String codigo;
		private String nome;
		private String tipo;
		private int quantidade;
		private Double valor;
		
		public Builder comNone(String nome){
			this.nome = nome;
			return this;
		}
		public Builder comcodigo(String codigo){
			this.codigo = codigo;
			return this;
		}
		public Builder comTipo(String tipo){
			this.tipo = tipo;
			return this;
		}
		public Builder comQuantidade(int quantidade){
			this.quantidade = quantidade;
			return this;
		}
		public Builder comValor(Double valor){
			this.valor = valor;
			return this;
		}
		public Produto create(){
			return new Produto(codigo,nome,tipo,quantidade,valor);
		}
		
	}
}

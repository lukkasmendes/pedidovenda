package com.trabalhofinal.modls;

public class Pagamento {
	private String codigo;
	private String nome;
	private int parcelas;
	
	public Pagamento() {
		super();
	}

	public Pagamento(String codigo, String nome, int parcelas) {
		this.codigo = codigo;
		this.nome = nome;
		this.parcelas = parcelas;
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

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public static class Builder{
		private String codigo;
		private String nome;
		private int parcelas;
		
		public Builder comCodigo(String codigo){
			this.codigo = codigo;
			return this;
		}
		public Builder comNome(String nome){
			this.nome = nome;
			return this;
		}
		public Builder comParcelas(int parcelas){
			this.parcelas = parcelas;
			return this;
		}
		public Pagamento create(){
			return new Pagamento(codigo, nome, parcelas);
		}
		
	}
	
}

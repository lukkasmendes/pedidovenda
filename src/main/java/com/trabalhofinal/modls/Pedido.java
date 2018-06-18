package com.trabalhofinal.modls;

import com.trabalhofinal.modls.Pagamento.Builder;

public class Pedido {
	private String codigo;
	private String cliente;
	private String pagamento;
	private String produto;
	private String vendedor;
	private Double total;
	
	public Pedido() {
		super();
	}
	
	public Pedido(String codigo, String cliente, String pagamento, String produto, String vendedor, Double total){
		this.codigo = codigo;
		this.cliente = cliente;
		this.pagamento = pagamento;
		this.produto = produto;
		this.vendedor = vendedor;
		this.total = total;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public static class Builder{
		private String codigo;
		private String cliente;
		private String pagamento;
		private String produto;
		private String vendedor;
		private Double total;
		
		public Builder comCodigo(String codigo){
			this.codigo = codigo;
			return this;
		}
		public Builder comCliente(String cliente){
			this.cliente = cliente;
			return this;
		}
		public Builder comPagamento(String pagamento){
			this.pagamento = pagamento;
			return this;
		}
		public Builder comProduto(String produto){
			this.produto = produto;
			return this;
		}
		public Builder comVendedor(String vendedor){
			this.vendedor = vendedor;
			return this;
		}
		public Builder comTotal(Double total){
			this.total = total;
			return this;
		}
		public Pedido create(){
			return new Pedido(codigo, cliente, pagamento, produto, vendedor, total);
		}
	}
}

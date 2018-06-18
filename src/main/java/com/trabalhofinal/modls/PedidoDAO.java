package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PedidoDAO {
	private static Map<String,Pedido> PEDIDO = new LinkedHashMap<String,Pedido>();
	
	public PedidoDAO() {
		populaFakeItens();
	}
	public ArrayList<Pedido> todosPedidos(){
		return new ArrayList<Pedido>(PEDIDO.values());
	}
	private void populaFakeItens() {
		PEDIDO.put("111", new Pedido.Builder().comCodigo("111").comCliente("Pedro").comPagamento("Cartao a vista").comProduto("Mouse").comVendedor("Joao").comTotal(45.00).create());
		PEDIDO.put("222", new Pedido.Builder().comCodigo("222").comCliente("Paulo").comPagamento("Dineiro avista").comProduto("Teclado").comVendedor("Mateus").comTotal(45.00).create());
		PEDIDO.put("333", new Pedido.Builder().comCodigo("333").comCliente("Maria").comPagamento("Cartao 3x").comProduto("Notbook").comVendedor("Fabiola").comTotal(2500.00).create());
	}
	public static void cadastrar(Pedido pedido) {
		PEDIDO.put(pedido.getCodigo(), pedido);
	}
}

package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProdutoDAO {
	private static Map<String,Produto> CD = new LinkedHashMap<>();
	
	public ProdutoDAO() {
		populaFakeItens();
	}
	public ArrayList<Produto> todosProdutos(){
		return new ArrayList<Produto>(CD.values());
	}
	private void populaFakeItens() {
		CD.put("Mouse", new Produto.Builder().comcodigo("66001").comNone("Mouse").comTipo("Informatica").comQuantidade(5).comValor(45.00).create());
		CD.put("Mesa", new Produto.Builder().comcodigo("66002").comNone("Mesa").comTipo("Escritorio").comQuantidade(4).comValor(420.00).create());
		CD.put("Cad", new Produto.Builder().comcodigo("66003").comNone("Cadeiras").comTipo("Escritorio").comQuantidade(8).comValor(120.00).create());
		CD.put("Tec", new Produto.Builder().comcodigo("66004").comNone("Teclado").comTipo("Informatica").comQuantidade(5).comValor(45.00).create());
		CD.put("Not", new Produto.Builder().comcodigo("66005").comNone("Notbook").comTipo("Informatica").comQuantidade(7).comValor(2500.00).create());
		CD.put("PC", new Produto.Builder().comcodigo("66006").comNone("Computador").comTipo("Informatica").comQuantidade(3).comValor(2500.00).create());
		CD.put("Fo", new Produto.Builder().comcodigo("66007").comNone("Fone de Ouvido").comTipo("Informatica").comQuantidade(10).comValor(85.00).create());
		CD.put("Mic", new Produto.Builder().comcodigo("66008").comNone("Microfone").comTipo("Informatica").comQuantidade(6).comValor(40.00).create());
		CD.put("HD", new Produto.Builder().comcodigo("66009").comNone("HD Externo").comTipo("Informatica").comQuantidade(5).comValor(350.00).create());
		CD.put("SSD", new Produto.Builder().comcodigo("66010").comNone("HD SSD").comTipo("Informatica").comQuantidade(5).comValor(320.00).create());
	
	}
}

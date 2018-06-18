package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class VendedorDAO {
	private static Map<String,Vendedor> VV = new LinkedHashMap<String,Vendedor>();

	public VendedorDAO() {
		populaFakeItens();
	}
	public ArrayList<Vendedor> todosVendedores(){
		return new ArrayList<Vendedor>(VV.values());
	}
	private void populaFakeItens() {
		VV.put("Pedro", new Vendedor.Builder().comNome("Pedro").comSobrenome("Dos Santos").comCodigo("31001").create());
		VV.put("Paulo", new Vendedor.Builder().comNome("Paulo").comSobrenome("Corso").comCodigo("31002").create());
		VV.put("Maria", new Vendedor.Builder().comNome("Maria").comSobrenome("Bosco").comCodigo("31003").create());
		VV.put("Marina", new Vendedor.Builder().comNome("Marina").comSobrenome("Dalbosco").comCodigo("31004").create());
		VV.put("Fabiana", new Vendedor.Builder().comNome("Fabiana").comSobrenome("Papini").comCodigo("31005").create());
		VV.put("Fabiola", new Vendedor.Builder().comNome("Fabiola").comSobrenome("Pasquali").comCodigo("31006").create());
		VV.put("Mateus", new Vendedor.Builder().comNome("Mateus").comSobrenome("Bueno Fereira").comCodigo("31007").create());
		VV.put("Joao", new Vendedor.Builder().comNome("Joao").comSobrenome("Pereira").comCodigo("31008").create());
	}
}

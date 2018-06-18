package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FornecedorDAO {
	private static Map<String,Fornecedor> FORN = new LinkedHashMap<String,Fornecedor>();

	public FornecedorDAO() {
		populaFakeItens();
	}
	public ArrayList<Fornecedor> todosFornecedores(){
		return new ArrayList<Fornecedor>(FORN.values());
	}
	private void populaFakeItens() {
		FORN.put("Intel", new Fornecedor.Builder().comCodigo("1111").comNome("Intel").comTelefone("54999999999").comEmail("geral@intel.com").comEndereco("rua intel 234").comCnpj("62027128000104").create());
		FORN.put("Dell", new Fornecedor.Builder().comCodigo("2222").comNome("Dell").comTelefone("54999999999").comEmail("geral@dell.com").comEndereco("rua dell 134").comCnpj("25247821000158").create());
		FORN.put("Multilaser", new Fornecedor.Builder().comCodigo("2222").comNome("Multilaser").comTelefone("54999999999").comEmail("geral@multilaser.com").comEndereco("rua multi 644").comCnpj("65428802000142").create());
	}
	public static void cadastrar(Fornecedor fornecedor) {
		FORN.put(fornecedor.getCodigo(), fornecedor);
	}
}

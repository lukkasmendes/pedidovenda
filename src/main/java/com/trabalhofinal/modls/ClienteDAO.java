package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClienteDAO {
	private static Map<String,Cliente> CC = new LinkedHashMap<String,Cliente>();

	public ClienteDAO() {
		populaFakeItens();
	}
	public ArrayList<Cliente> todosCliente(){
		return new ArrayList<Cliente>(CC.values());
	}

	public void cadastraCliente(Cliente cliente){
		CC.put(cliente.getCodigo(), cliente);
	}

	private void populaFakeItens() {
		CC.put("Pedro", new Cliente.Builder().comCodigo("91001").comNome("Pedro").comSobrenome("Dos Santos").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Paulo", new Cliente.Builder().comCodigo("91002").comNome("Paulo").comSobrenome("Corso").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Maria", new Cliente.Builder().comCodigo("91003").comNome("Maria").comSobrenome("Bosco").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Marina", new Cliente.Builder().comCodigo("91004").comNome("Marina").comSobrenome("Dalbosco").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Fabiana", new Cliente.Builder().comCodigo("91005").comNome("Fabiana").comSobrenome("Papini").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Fabiola", new Cliente.Builder().comCodigo("91006").comNome("Fabiola").comSobrenome("Pasquali").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Mateus", new Cliente.Builder().comCodigo("91007").comNome("Mateus").comSobrenome("Bueno Fereira").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
		CC.put("Joao", new Cliente.Builder().comCodigo("91008").comNome("Joao").comSobrenome("Pereira").comDataNascimento(null).comCidade("Passo Fundo").comEstado("RS").create());
	}
}

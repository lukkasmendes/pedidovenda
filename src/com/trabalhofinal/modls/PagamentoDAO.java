package com.trabalhofinal.modls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class PagamentoDAO {
	private static Map<String,Pagamento> CP = new LinkedHashMap<>();
	
	public PagamentoDAO() {
		populaFakeItens();
	}
	public ArrayList<Pagamento> todosPagamentos(){
		return new ArrayList<Pagamento>(CP.values());
	}
	private void populaFakeItens() {
		CP.put("901", new Pagamento.Builder().comCodigo("901").comNome("Cartao a vista").comParcelas(1).create());
		CP.put("902", new Pagamento.Builder().comCodigo("902").comNome("Cartao 2x").comParcelas(2).create());
		CP.put("903", new Pagamento.Builder().comCodigo("903").comNome("Cartao 3x").comParcelas(3).create());
		CP.put("904", new Pagamento.Builder().comCodigo("904").comNome("Dineiro avista").comParcelas(1).create());
		CP.put("905", new Pagamento.Builder().comCodigo("905").comNome("Cartao 1+2x").comParcelas(2).create());
		CP.put("906", new Pagamento.Builder().comCodigo("906").comNome("Cartao 1+3x").comParcelas(3).create());
	}
	public static void cadastrar(Pagamento pagamento) {
		CP.put(pagamento.getCodigo(), pagamento);
	}
}

package com.trabalhofinal.ws;

import com.trabalhofinal.modls.Cliente;
import com.trabalhofinal.modls.Pagamento;
import com.trabalhofinal.modls.Produto;
import com.trabalhofinal.modls.Vendedor;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface LojaWS {

    //funcoes cliente
    @WebMethod
    public List<Cliente> todosClientes();

    @WebMethod
    public Cliente insereCliente();

    @WebMethod
    public Cliente buscaCliente(String codigo);

    //funcoes produtos
    @WebMethod
    public List<Produto> todosProdutos();

    @WebMethod
    public Produto insereProduto();

    @WebMethod
    public Produto buscaProduto(String codigo);

    //funcoes pagamento
    @WebMethod
    public List<Pagamento> todosPagamentos();

    @WebMethod
    public Pagamento inserePagamento(String codigo, String nome, int parcelas);

    @WebMethod
    public Pagamento buscaPagamento(String codigo);

    //funcoes vendedor
    @WebMethod
    public List<Vendedor> todosVendedores();

    @WebMethod
    public Vendedor insereVendedor();

    @WebMethod
    Vendedor buscaVendedor(String codigo);
}

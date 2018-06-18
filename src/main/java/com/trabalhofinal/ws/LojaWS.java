package com.trabalhofinal.ws;

import com.trabalhofinal.faults.WithoutFieldFault;
import com.trabalhofinal.modls.Cliente;
import com.trabalhofinal.modls.Fornecedor;
import com.trabalhofinal.modls.Pagamento;
import com.trabalhofinal.modls.Pedido;
import com.trabalhofinal.modls.Produto;
import com.trabalhofinal.modls.Vendedor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

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

    //funcoes vendedor
    @WebMethod
    public List<Vendedor> todosVendedores();

    @WebMethod
    public Vendedor insereVendedor();

    @WebMethod
    public Vendedor buscaVendedor(String codigo);
    
    //funcoes pagamento
    @WebMethod
    public List<Pagamento> todosPagamentos();

   /* @WebMethod
    public Pagamento inserePagamento(String codigo, String nome, int parcelas);*/
    
    @WebResult(name="pagamentoSalvo")
	@ResponseWrapper(localName="PagamentoSalvoNaBase")
	public Pagamento inserePagamento(
			@WebParam(name="pagamentoParaSalvar") Pagamento pagamento) 
					throws WithoutFieldFault;

    @WebMethod
    public Pagamento buscaPagamento(@WebParam(name="codigo") String codigo);

    //funcoes pedido
    @WebResult(name="pedidoSalvo")
	@ResponseWrapper(localName="PedidoSalvoNaBase")
	public Pedido inserePedido(
			@WebParam(name="pedidoParaSalvar") Pedido pedido) 
					throws WithoutFieldFault;

    @WebMethod
    public Pedido buscaPedido(@WebParam(name="codigo") String codigo);
    
    @WebMethod
    public List<Pedido> todosPedidos();
    
    
    //funcoes fornecedor
    @WebResult(name="fornecedorSalvo")
	@ResponseWrapper(localName="FornecedorSalvoNaBase")
	public Fornecedor insereFornecedor(
			@WebParam(name="fornecedorParaSalvar") Fornecedor fornecedor) 
					throws WithoutFieldFault;

    @WebMethod
    public Fornecedor buscaFornecedor(@WebParam(name="codigo") String codigo);
    
    @WebMethod
    public List<Fornecedor> todosFornecedores();
}

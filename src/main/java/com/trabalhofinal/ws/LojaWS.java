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
    @WebResult(name="clienteSalvo")
    @ResponseWrapper(localName = "ClienteSalvo")
    public Cliente insereCliente(@WebParam(name="cadastrarCliente") Cliente cliente) throws WithoutFieldFault;

    @WebMethod
    public Cliente buscaCliente(@WebParam(name = "codigoCliente") String codigo) throws WithoutFieldFault;


    //funcoes produtos
    @WebMethod
    public List<Produto> todosProdutos();

    @WebMethod
    @WebResult(name="produtoSalvo")
    @ResponseWrapper(localName = "ProdutoSalvo")
    public Produto insereProduto(@WebParam(name="cadastrarProduto") Produto produto) throws WithoutFieldFault;

    @WebMethod
    public Produto buscaProduto(@WebParam(name="codigoProduto") String codigo) throws WithoutFieldFault;


    //funcoes vendedor
    @WebMethod
    public List<Vendedor> todosVendedores();

    @WebMethod
    @WebResult(name="vendedorSalvo")
    @ResponseWrapper(localName = "VendedorSalvo")
    public Vendedor insereVendedor(@WebParam(name="cadastrarVendedor") Vendedor vendedor) throws WithoutFieldFault;

    @WebMethod
    public Vendedor buscaVendedor(@WebParam(name="codigoVendedor") String codigo) throws WithoutFieldFault;


    //funcoes pagamento
    @WebMethod
    public List<Pagamento> todosPagamentos();

    @WebResult(name="pagamentoSalvo")
	@ResponseWrapper(localName="PagamentoSalvoNaBase")
	public Pagamento inserePagamento(@WebParam(name="pagamentoParaSalvar") Pagamento pagamento) throws WithoutFieldFault;

    @WebMethod
    public Pagamento buscaPagamento(@WebParam(name="codigoPagamento") String codigo) throws WithoutFieldFault;


    //funcoes pedido
    @WebMethod
    public List<Pedido> todosPedidos();

    @WebResult(name="pedidoSalvo")
	@ResponseWrapper(localName="PedidoSalvoNaBase")
	public Pedido inserePedido(
			@WebParam(name="pedidoParaSalvar") Pedido pedido) 
					throws WithoutFieldFault;

    @WebMethod
    public Pedido buscaPedido(@WebParam(name="codigo") String codigo) throws WithoutFieldFault;
    

    //funcoes fornecedor
    @WebMethod
    public List<Fornecedor> todosFornecedores();

    @WebResult(name="fornecedorSalvo")
	@ResponseWrapper(localName="FornecedorSalvoNaBase")
	public Fornecedor insereFornecedor(
			@WebParam(name="fornecedorParaSalvar") Fornecedor fornecedor) 
					throws WithoutFieldFault;

    @WebMethod
    public Fornecedor buscaFornecedor(@WebParam(name="codigoFornecedor") String codigo) throws WithoutFieldFault;

}

package com.trabalhofinal.ws;


import com.trabalhofinal.modls.*;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface="com.trabalhofinal.ws.LojaWS")
public class LojaWSImpl implements LojaWS {
    private ClienteDAO cliDAO = new ClienteDAO();
    private ProdutoDAO prodDAO = new ProdutoDAO();
    private PagamentoDAO pagDAO = new PagamentoDAO();
    private VendedorDAO vendDAO = new VendedorDAO();

    //funcoes cliente
    @Override
    public List<Cliente> todosClientes() {
        return cliDAO.todosCliente();
    }

    @Override
    public Cliente insereCliente(){
        return null;
    }

    @Override
    public Cliente buscaCliente(String codigo) {
        List<Cliente> clientes = cliDAO.todosCliente();
        Cliente result = null;
        for (Cliente cliente : clientes) {
            if(cliente.getCodigo().equals(codigo)){
                result = cliente;
            }
        }
        return result;
    }


    //funcoes pagamento
    @Override
    public List<Pagamento> todosPagamentos() {
        return pagDAO.todosPagamentos();
    }

    @Override
    public Pagamento inserePagamento(String codigo, String nome, int parcelas){
        return null;
    }

    @Override
    public Pagamento buscaPagamento(String codigo){
        List<Pagamento> pagamentos = pagDAO.todosPagamentos();
        Pagamento result = null;
        for (Pagamento pagamento : pagamentos) {
            if(pagamento.getCodigo().equals(codigo)){
                result = pagamento;
            }
        }
        return result;
    }

    //funcoes produto
    @Override
    public List<Produto> todosProdutos() {
        return prodDAO.todosProdutos();
    }

    @Override
    public Produto buscaProduto(String codigo){
        List<Produto> produtos = prodDAO.todosProdutos();
        Produto result = null;
        for (Produto produto : produtos) {
            if(produto.getCodigo().equals(codigo)){
                result = produto;
            }
        }
        return result;
    }

    //funcoes vendedor
    @Override
    public List<Vendedor> todosVendedores() {
        return vendDAO.todosVendedores();
    }

    @Override
    public Vendedor buscaVendedor(String codigo){
        List<Vendedor> vendedores = vendDAO.todosVendedores();
        Vendedor result = null;
        for (Vendedor vendedor : vendedores) {
            if(vendedor.getCodigo().equals(codigo)){
                result = vendedor;
            }
        }
        return result;
    }
}

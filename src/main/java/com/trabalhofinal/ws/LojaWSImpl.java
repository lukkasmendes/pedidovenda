package com.trabalhofinal.ws;


import com.trabalhofinal.faults.WithoutFieldFault;
import com.trabalhofinal.modls.*;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface="com.trabalhofinal.ws.LojaWS")
public class LojaWSImpl implements LojaWS {
    private ClienteDAO cliDAO = new ClienteDAO();
    private ProdutoDAO prodDAO = new ProdutoDAO();
    private PagamentoDAO pagDAO = new PagamentoDAO();
    private VendedorDAO vendDAO = new VendedorDAO();
    private PedidoDAO pedDAO = new PedidoDAO();
    private FornecedorDAO forDAO = new FornecedorDAO();

    //funcoes cliente
    @Override
    public List<Cliente> todosClientes() {
        return cliDAO.todosCliente();
    }

    @Override
    public Cliente insereCliente(Cliente cliente){
        cliDAO.cadastraCliente(cliente);
        return cliente;
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
    public Pagamento inserePagamento(Pagamento pagamento) throws WithoutFieldFault{
		if (pagamento.getCodigo().trim().length() == 0) {
			throw new WithoutFieldFault("Código inexistente");
		}
		if (pagamento.getNome() == null) {
			throw new WithoutFieldFault("Sem nome válido");
		}
        pagDAO.cadastraPagamento(pagamento);
		return pagamento;
    }

    @Override
    public Pagamento buscaPagamento(String codigo) throws WithoutFieldFault{
        List<Pagamento> pagamentos = pagDAO.todosPagamentos();
        Pagamento result = null;
        for (Pagamento pagamento : pagamentos) {
            if(pagamento.getCodigo().equals(codigo)){
                result = pagamento;
            }
        }
        if (result == null){
            throw new WithoutFieldFault("Pagamento nao encontrado");
        }else {
            return result;
        }
    }

    //funcoes produto
    @Override
    public List<Produto> todosProdutos() {
        return prodDAO.todosProdutos();
    }

    public Produto insereProduto(Produto produto) {
        prodDAO.cadastraProduto(produto);
        return produto;
    }

    @Override
    public Produto buscaProduto(String codigo) throws WithoutFieldFault{
        List<Produto> produtos = prodDAO.todosProdutos();
        Produto result = null;
        for (Produto produto : produtos) {
            if(produto.getCodigo().equals(codigo)){
                result = produto;
            }
        }
        if (result == null){
            throw new WithoutFieldFault("Pagamento nao encontrado");
        }else {
            return result;
        }
    }

    //funcoes vendedor
    @Override
    public List<Vendedor> todosVendedores() {
        return vendDAO.todosVendedores();
    }

    public Vendedor insereVendedor(Vendedor vendedor) {
        vendDAO.insereVendedor(vendedor);
        return vendedor;
    }

    @Override
    public Vendedor buscaVendedor(String codigo) throws WithoutFieldFault{
        List<Vendedor> vendedores = vendDAO.todosVendedores();
        Vendedor result = null;
        for (Vendedor vendedor : vendedores) {
            if(vendedor.getCodigo().equals(codigo)){
                result = vendedor;
            }
        }
        if (result == null){
            throw new WithoutFieldFault("Vendedor nao encontrado");
        }else {
            return result;
        }

    }
    
    //funcoes pedido
    @Override
    public List<Pedido> todosPedidos() {
        return pedDAO.todosPedidos();
    }
    
    @Override
    public Pedido buscaPedido(String codigo) throws WithoutFieldFault{
        List<Pedido> pedidos = pedDAO.todosPedidos();
        Pedido result = null;
        for (Pedido pedido : pedidos) {
            if(pedido.getCodigo().equals(codigo)){
                result = pedido;
            }
        }
        if (result == null){
            throw new WithoutFieldFault("Pedido nao encontrado");
        }else {
            return result;
        }
    }
    
    @Override
    public Pedido inserePedido(Pedido pedido) throws WithoutFieldFault{

		if (pedido.getCodigo().trim().length() == 0) {
			throw new WithoutFieldFault("Código inexistente");
		}
		if (pedido.getCliente() == null) {
			throw new WithoutFieldFault("Sem cliente válido");
		}
		if (pedido.getPagamento() == null) {
			throw new WithoutFieldFault("Sem pagamento válido");
		}
		if (pedido.getProduto() == null) {
			throw new WithoutFieldFault("Sem produto válido");
		}
		if (pedido.getVendedor() == null) {
			throw new WithoutFieldFault("Sem vendedor válido");
		}

        pedDAO.cadastrarPedido(pedido);

		return pedido;
    }
    
  //funcoes fornecedor
    @Override
    public List<Fornecedor> todosFornecedores() {
        return forDAO.todosFornecedores();
    }
    
    @Override
    public Fornecedor buscaFornecedor(String codigo){
        List<Fornecedor> fornecedores = forDAO.todosFornecedores();
        Fornecedor result = null;
        for (Fornecedor fornecedor : fornecedores) {
            if(fornecedor.getCodigo().equals(codigo)){
                result = fornecedor;
            }
        }
        return result;
    }
    
    @Override
    public Fornecedor insereFornecedor(Fornecedor fornecedor) throws WithoutFieldFault {
        forDAO.cadastraFornecedor(fornecedor);

        if (fornecedor.getCodigo().trim().length() == 0) {
            throw new WithoutFieldFault("Código inexistente");
        }
        if (fornecedor.getNome() == null) {
            throw new WithoutFieldFault("Preencha o campo nome");
        }
        if (fornecedor.getCnpj() == null) {
            throw new WithoutFieldFault("Sem cnpj válido");
        }

        return fornecedor;
    }
}

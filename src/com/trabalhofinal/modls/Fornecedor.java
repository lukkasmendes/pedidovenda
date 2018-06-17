package com.trabalhofinal.modls;

import java.util.Date;

import com.trabalhofinal.modls.Cliente.Builder;

public class Fornecedor {
	private String codigo;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private String cnpj;
    
    public Fornecedor() {
        super();
    }
    
    public Fornecedor(String codigo, String nome, String telefone, String email,
            String endereco, String cnpj) {
		 super();
		 this.codigo = codigo;
		 this.nome = nome;
		 this.telefone = telefone;
		 this.email = email;
		 this.endereco = endereco;
		 this.cnpj = cnpj;
    }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
	public static class Builder {
		private String codigo;
	    private String nome;
	    private String telefone;
	    private String email;
	    private String endereco;
	    private String cnpj;

        public Builder comCodigo(String codigo) {
            this.codigo = codigo;
            return this;
        }
        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }
        public Builder comTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }
        public Builder comEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder comEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }
        public Builder comCnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }
        public Fornecedor create() {
            return new Fornecedor(codigo, nome, telefone, email, endereco, cnpj);
        }

    }
}

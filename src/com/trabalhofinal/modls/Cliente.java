package com.trabalhofinal.modls;


import java.util.Date;

public class Cliente {
    private String codigo;
    private String nome;
    private String sobrenome;
    private Date datanascimento;
    private String cidade;
    private String estado;

    public Cliente() {
        super();
    }

    public Cliente(String codigo, String nome, String sobrenome, Date datanascimento,
                   String cidade, String estado) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.datanascimento = datanascimento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public static class Builder {
        private String codigo;
        private String nome;
        private String sobrenome;
        private Date datanascimento;
        private String cidade;
        private String estado;

        public Builder comCodigo(String codigo) {
            this.codigo = codigo;
            return this;
        }
        public Builder comNome(String nome) {
            this.nome = nome;
            return this;
        }
        public Builder comSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }
        public Builder comDataNascimento(Date datanascimeto) {
            this.datanascimento = datanascimeto;
            return this;
        }
        public Builder comCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }
        public Builder comEstado(String estado) {
            this.estado = estado;
            return this;
        }
        public Cliente create() {
            return new Cliente(codigo, nome, sobrenome, datanascimento, cidade, estado);
        }

    }

}

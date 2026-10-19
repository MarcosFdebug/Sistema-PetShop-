package com.mycompany.java_petshop;

public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;

    public Cliente(int codigo, String nome, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.length() > 0) {
            this.telefone = telefone;
        }
    }

    public void exibirDados() {
        System.out.println(codigo + " | " + nome
                + " | Telefone: " + telefone);
    }
}
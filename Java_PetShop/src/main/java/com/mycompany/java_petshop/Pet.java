package com.mycompany.java_petshop;


public class Pet {
    private int codigo;
    private String nome;
    private String especie;
    private Cliente cliente;


    public Pet(int codigo, String nome, String especie, Cliente cliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.especie = especie;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public int getEspecie() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
public boolean trocarResponsavel(Cliente novoCliente) {
        if (novoCliente == null) {
            return false;
        }
        if (cliente.getCodigo() == novoCliente.getCodigo()) {
            return false;
        }
        cliente = novoCliente;
        return true;
    }


    public void exibirDados() {
        System.out.println(codigo + " | " + nome + " | Especie: " + especie
                + " | Responsavel: " + cliente.getNome());
    }
}


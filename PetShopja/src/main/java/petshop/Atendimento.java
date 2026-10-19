package com.mycompany.java_petshop

public class Atendimento {
    private int codigo;
    private Pet pet;
    private String servico;
    private int valorCentavos;
    private boolean concluido;

    public Atendimento(int codigo, Pet pet, String servico, int valorCentavos) {
        this.codigo = codigo;
        this.pet = pet;
        this.servico = servico;
        this.valorCentavos = valorCentavos;
        this.concluido = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSituacao() {
        if (concluido) {
            return "Concluido";
        } else {
            return "Pendente";
        }
    }

    public boolean concluir() {
        if (concluido) {
            return false;
        } else {
            concluido = true;
            return true;
        }
    }

    // Divisao inteira e resto
    public String getValorFormatado() {
        int reais = valorCentavos / 100;
        int centavos = valorCentavos % 100;
        if (centavos < 10) {
            return reais + ",0" + centavos;
        } else {
            return reais + "," + centavos;
        }
    }

    public void exibirDados() {
        System.out.println(codigo + " | Pet: " + pet.getNome() + " | " + servico
                + " | R$ " + getValorFormatado() + " | " + getSituacao());
    }
}

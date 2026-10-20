package com.mycompany.java_petshop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {

    private Scanner scanner = new Scanner(System.in);

    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Pet> pets = new ArrayList<Pet>();
    private List<Atendimento> atendimentos = new ArrayList<Atendimento>();

    public static void main(String[] args) {
        App sistema = new App();
        sistema.executar();
    }

    private void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;

                case 2:
                    listarClientes();
                    break;

                case 3:
                    atualizarTelefone();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida. Escolha de 0 a 3.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n=== PETSHOP ===");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Listar clientes");
        System.out.println("3 - Atualizar telefone do cliente");
        System.out.println("0 - Sair");
    }

    private int lerInteiro(String mensagem) {
        int numero = 0;
        boolean leituraCorreta = false;

        do {
            System.out.println(mensagem);

            try {
                numero = scanner.nextInt();
                leituraCorreta = true;
            } catch (Exception erro) {
                System.out.println("Digite um numero inteiro valido.");
            }

            scanner.nextLine();

        } while (leituraCorreta == false);

        return numero;
    }

    private String lerTexto(String mensagem) {
        String texto;

        do {
            System.out.println(mensagem);
            texto = scanner.nextLine();

            if (texto.length() == 0) {
                System.out.println("Esse campo nao pode ficar vazio.");
            }

        } while (texto.length() == 0);

        return texto;
    }

    private void cadastrarCliente() {
        String nome = lerTexto("Nome do cliente: ");
        String telefone = lerTexto("Telefone: ");

        Cliente cliente = new Cliente(clientes.size() + 1, nome, telefone);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado. Codigo: " + cliente.getCodigo());
    }

    private void listarClientes() {
        if (clientes.size() == 0) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                cliente.exibirDados();
            }
        }
    }

    private Cliente buscarCliente(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    private void atualizarTelefone() {
        if (clientes.size() == 0) {
            System.out.println("Cadastre um cliente primeiro.");
            return;
        }

        listarClientes();
        int codigo = lerInteiro("Codigo do cliente: ");
        Cliente cliente = buscarCliente(codigo);

        if (cliente == null) {
            System.out.println("Cliente nao encontrado.");
        } else {
            String telefone = lerTexto("Novo telefone: ");
            cliente.setTelefone(telefone);
            System.out.println("Telefone atualizado.");
        }
    }


private void cadastrarPet() {
        if (clientes.size() == 0) {
            System.out.println("Cadastre um cliente antes de cadastrar um pet.");
            return;
        }

        listarClientes();
        int codigo = lerInteiro("Codigo do cliente responsavel: ");
        Cliente cliente = buscarCliente(codigo);

        if (cliente == null) {
            System.out.println("Cliente nao encontrado. Pet nao cadastrado.");
            return;
        }

        String nome = lerTexto("Nome do pet: ");
        String especie = lerTexto("Especie (exemplo: cachorro ou gato): ");

        Pet pet = new Pet(pets.size() + 1, nome, especie, cliente);
        pets.add(pet);

        System.out.println("Pet cadastrado. Codigo: " + pet.getCodigo());
    }

    private void listarPets() {
        if (pets.size() == 0) {
            System.out.println("Nenhum pet cadastrado.");
        } else {
            for (Pet pet : pets) {
                pet.exibirDados();
            }
        }
    }

    private Pet buscarPet(int codigo) {
        for (Pet pet : pets) {
            if (pet.getCodigo() == codigo) {
                return pet;
            }
        }
        return null;
    }

    private void trocarResponsavel() {
        if (pets.size() == 0) {
            System.out.println("Cadastre um pet primeiro.");
            return;
        }

        listarPets();
        int codigoPet = lerInteiro("Codigo do pet: ");
        Pet pet = buscarPet(codigoPet);

        if (pet == null) {
            System.out.println("Pet nao encontrado.");
            return;
        }

        listarClientes();
        int codigoCliente = lerInteiro("Codigo do novo responsavel: ");
        Cliente novoCliente = buscarCliente(codigoCliente);

        if (novoCliente == null) {
            System.out.println("Cliente nao encontrado. Responsavel mantido.");
        } else if (pet.trocarResponsavel(novoCliente)) {
            System.out.println("Responsavel atualizado.");
        } else {
            System.out.println("Esse cliente ja e o responsavel pelo pet.");
        }
    }
}


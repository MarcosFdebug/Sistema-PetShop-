# Sistema PetShop

Projeto acadêmico desenvolvido em Java, com execução pelo terminal, para gerenciar clientes, pets e atendimentos de um pet shop.

## Funcionalidades

**Clientes**
- Cadastrar clientes com código, nome e telefone.
- Listar os clientes cadastrados.
- Atualizar o telefone de um cliente pelo código.

**Pets**
- Cadastrar pets vinculados a um cliente responsável.
- Listar os pets cadastrados.
- Trocar o responsável por um pet.

**Atendimentos**
- Registrar atendimentos de banho ou tosa para um pet.
- Informar o valor do atendimento em centavos.
- Listar atendimentos e seus status.
- Marcar atendimentos como concluídos.

## Tecnologias utilizadas

- Java
- Apache Maven
- Apache NetBeans

## Estrutura do projeto

Os arquivos principais estão em `Java_PetShop/src/main/java/com/mycompany/java_petshop/`:

| Arquivo | Responsabilidade |
| --- | --- |
| `Cliente.java` | Representar os dados dos clientes e permitir a consulta e atualização do telefone. |
| `Pet.java` | Representar os pets e seus responsáveis. |
| `Atendimento.java` | Representar os serviços registrados para os pets. |
| `App.java` | Iniciar o programa, exibir o menu, receber dados e executar as funcionalidades. |

## Como executar

1. Baixe ou clone o repositório.
2. Abra o **Apache NetBeans**.
3. Abra o projeto Maven localizado na pasta **`Java_PetShop`**, onde está o arquivo `pom.xml`.
4. Execute a classe **`App.java`**.
5. Utilize as opções do menu exibido no terminal.

## Menu do sistema

```text
=== PETSHOP ===
1 - Cadastrar cliente
2 - Listar clientes
3 - Atualizar telefone do cliente
4 - Cadastrar pet
5 - Listar pets
6 - Trocar responsavel pelo pet
7 - Registrar atendimento
8 - Listar atendimentos
9 - Concluir atendimento
0 - Sair
```

## Funcionamento

O sistema utiliza classes para representar clientes, pets e atendimentos. Os cadastros são armazenados em listas (`ArrayList`) durante a execução. Para cadastrar um pet, é necessário ter um cliente responsável; para registrar um atendimento, é necessário ter um pet cadastrado.

**Observação:** os dados ficam apenas na memória enquanto o programa está aberto. Não há banco de dados ou salvamento permanente nesta versão.

## Divisão do trabalho

- **Fernando:** classe `Cliente.java`, estrutura principal de `App.java` e funcionalidades de clientes.
- **Cords:** classe `Pet.java` e funcionalidades de pets no `App.java`.
- **Marcos:** classe `Atendimento.java` e funcionalidades de atendimentos no `App.java`.

# Sistema Bancário Simples

Este projeto é uma implementação simples de um sistema bancário em Java. Ele permite criar um banco, adicionar contas de clientes, realizar operações bancárias como saques, depósitos e transferências, e listar os clientes do banco.

## Funcionalidades

- **Criar Banco:** Você pode criar um banco com um nome específico.
- **Adicionar Contas:** Adicione contas ao banco, associando-as a clientes.
- **Operações Bancárias:** Realize saques, depósitos e transferências entre contas.
- **Listar Clientes:** Obtenha uma lista de clientes únicos que possuem contas no banco.

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

1. **Cliente**
   - Representa um cliente do banco.
   - Atributos: `nome`.
   - Métodos: `getNome()`, `setNome(String nome)`, `equals(Object obj)`, `hashCode()`.

2. **Conta**
   - Representa uma conta bancária.
   - Atributos: `agencia`, `conta`, `saldo`, `cliente`.
   - Métodos: `sacar(double valor)`, `depositar(double valor)`, `transferir(double valor, Conta contaDestino)`, `mostrarDados()`, `getCliente()`.

3. **Banco**
   - Representa um banco que contém várias contas.
   - Atributos: `nome`, `contas`.
   - Métodos: `getNome()`, `setNome(String nome)`, `getContas()`, `adicionarConta(Conta conta)`, `getClientes()`.

4. **Main**
   - Classe principal para executar o sistema e testar as funcionalidades.

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/sistema-bancario-simples.git

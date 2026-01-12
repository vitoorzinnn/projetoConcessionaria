# concessionariaVeiculos

Sistema de Concessionária desenvolvido para gerenciar a venda de veículos (Carro, Moto e Caminhão), controlando clientes, vendedores e transações de venda, com base em um modelo orientado a objetos e um banco de dados relacional.

Projeto ETB A3 – 3º Semestre  
Linguagem Técnica de Programação / Banco de Dados  
Projeto orientado pelo professor Vinicius Cruz;

---

## Descrição do Projeto

O projeto **Concessionária de Veículos** simula o funcionamento básico de uma concessionária, permitindo o cadastro de veículos, clientes e vendedores, além do registro de vendas.  
O sistema foi modelado utilizando **UML (Diagrama de Classes)** e **Modelo Relacional (DER)**, aplicando conceitos de **herança, associação, encapsulamento e normalização de dados**.

---

## Funcionalidades

### Estrutura de Classes

- Classe base **Veículo** contendo atributos comuns:
  - chassi  
  - placa  
  - cor  
  - ano  

- Classes especializadas que herdam de Veículo:
  - **Carro**
    - modelo
    - marca
    - potência do motor
    - tipo de carroceria
  - **Moto**
    - modelo
    - marca
    - cilindrada
  - **Caminhão**
    - modelo
    - marca
    - carga máxima

- Classe **Cliente**
  - nome
  - CPF
  - telefone
  - e-mail

- Classe **Vendedor**
  - nome
  - matrícula
  - salário
  - telefone

- Classe **Venda**
  - data da venda
  - valor total
  - associação com Cliente
  - associação com Vendedor
  - associação com apenas **um tipo de veículo por venda** (Carro, Moto ou Caminhão)

---

### Banco de Dados (Modelo Relacional)

- Tabelas independentes para:
  - Cliente
  - Vendedor
  - Carro
  - Moto
  - Caminhão

- Tabela **Venda** centralizando as relações:
  - Chaves estrangeiras para Cliente e Vendedor
  - Chave estrangeira para o veículo vendido (Carro, Moto ou Caminhão)
- Garantia de integridade referencial
- Estrutura normalizada para evitar redundância de dados

---

### Processamento

- Registro de vendas vinculando:
  - Cliente
  - Vendedor
  - Tipo de veículo vendido
- Armazenamento do valor total da venda
- Controle das informações conforme o modelo UML e o DER

---

### Conceitos Aplicados

- Programação Orientada a Objetos (POO)
  - Herança
  - Encapsulamento
  - Associação
- UML – Diagrama de Classes
- Modelagem de Banco de Dados
  - DER (Diagrama Entidade-Relacionamento)
  - Chaves primárias e estrangeiras
- Organização e padronização de atributos

---

## Diagrama UML

```mermaid
classDiagram
    class Veiculo {
        -int ano
        -String chassi
        -String placa
        -String cor
    }

    class Carro {
        -int idCarro
        -String modelo
        -String marca
        -String potenciaMotor
        -String carroceria
    }

    class Moto {
        -int idMoto
        -String modelo
        -String marca
        -int cilindrada
    }

    class Caminhao {
        -int idCaminhao
        -String modelo
        -String marca
        -int cargaMaxima
    }

    class Cliente {
        -int idCliente
        -String nome
        -String cpf
        -String telefone
        -String email
    }

    class Vendedor {
        -int idVendedor
        -String nome
        -String matricula
        -double salario
        -String telefone
    }

    class Venda {
        -int idVenda
        -double valorTotal
        -String dataVenda
    }

    Veiculo <|-- Carro
    Veiculo <|-- Moto
    Veiculo <|-- Caminhao

    Venda --> Cliente
    Venda --> Vendedor
    Venda --> Carro
    Venda --> Moto
    Venda --> Caminhao

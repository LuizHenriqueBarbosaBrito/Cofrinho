# 🐷 Sistema de Cofrinho em Java

Este é um projeto prático desenvolvido em **Java** para aplicar os pilares da Programação Orientada a Objetos (POO). O sistema simula um cofrinho virtual, permitindo gerenciar diferentes tipos de moedas e calcular o saldo total convertido para uma única divisa.

## 🚀 Funcionalidades

O programa conta com um menu interativo via console (linha de comando) com as seguintes opções:
- **Adicionar Moeda:** Insira valores em Real, Dólar ou Euro.
- **Remover Moeda:** Retire uma moeda específica que já esteja dentro do cofre.
- **Listar Moedas:** Exiba todas as moedas guardadas e seus respectivos valores de face.
- **Calcular Total:** Converte automaticamente o valor de todas as moedas estrangeiras para Real e exibe o saldo total.

## 📚 Conceitos de POO Aplicados

Para a construção deste sistema, foram utilizados conceitos fundamentais da Orientação a Objetos:
- **Herança:** As classes `Dolar`, `Euro` e `Real` herdam atributos e métodos da classe mãe `Moeda`.
- **Polimorfismo:** Os métodos `info()` e `converter()` comportam-se de maneira diferente dependendo de qual moeda está sendo manipulada.
- **Classes Abstratas:** A classe `Moeda` atua como um molde abstrato, garantindo que todas as moedas filhas implementem suas próprias regras de conversão.
- **Encapsulamento:** Uso do modificador `private` na lista do `Cofrinho` para proteger os dados e manipulá-los apenas através de métodos específicos.

## 🛠️ Estrutura do Código

- `Principal.java`: Classe executável que contém o menu interativo e a leitura de dados do usuário (`Scanner`).
- `Cofrinho.java`: Gerencia a coleção de moedas usando um `ArrayList`.
- `Moeda.java`: Classe abstrata base. Utiliza o método `equals` sobrescrito para permitir a correta remoção de objetos da lista.
- `Real.java`, `Dolar.java`, `Euro.java`: Classes filhas com suas respectivas taxas de conversão (câmbio).

## ▶️ Como executar o projeto

1. Clone este repositório na sua máquina local:
   ```bash
   git clone <link-do-seu-repositorio-aqui>

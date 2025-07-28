# Projeto Conta Bancária em Java ☕

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📄 Sobre o Projeto

Este é um projeto de console em Java que simula as operações básicas de uma conta bancária. Ele foi desenvolvido como um exercício prático para aplicar conceitos de lógica de programação e regras de negócio em um ambiente interativo.

O sistema é controlado por um menu no terminal, permitindo que o usuário escolha as ações que deseja realizar de forma simples e direta.

## ✨ Funcionalidades

O sistema oferece um menu interativo com as seguintes operações:

-   💰 **Consultar Saldo Disponível:** Exibe o saldo atual da conta.
-   💳 **Consultar Limite do Cheque Especial:** Mostra o limite total e o valor já utilizado.
-   📥 **Realizar Depósitos:** Adiciona valores ao saldo da conta.
-   💸 **Efetuar Saques:** Retira valores da conta, utilizando o cheque especial se necessário.
-   📄 **Pagar Contas/Boletos:** Funciona de forma similar a um saque para debitar o valor.
-   🚨 **Verificar Uso do Cheque Especial:** Informa se a conta está atualmente utilizando o limite do cheque especial.
-   🚪 **Sair:** Finaliza a execução do programa.

## ⚙️ Regras de Negócio Implementadas

A lógica da conta bancária segue um conjunto de regras específicas, principalmente relacionadas ao Cheque Especial:

#### **Limite do Cheque Especial**

-   O limite é definido no momento da **criação da conta**, com base no valor do depósito inicial:
    -   Se o depósito inicial for **≤ R$ 500,00**, o limite do cheque especial será de **R$ 50,00**.
    -   Se o depósito inicial for **> R$ 500,00**, o limite do cheque especial será de **50% do valor depositado**.

#### **Taxa de Utilização**

-   Ao utilizar qualquer valor do Cheque Especial, uma **taxa de 20%** sobre o valor *usado* será cobrada.
-   Essa cobrança é efetuada automaticamente assim que a conta recebe um depósito que cubra o valor devido (o saldo utilizado do cheque especial + a taxa).

## 🚀 Como Executar o Projeto

Para executar este projeto, você precisará ter o **JDK (Java Development Kit)** instalado em sua máquina.

```bash
# 1. Clone o repositório
git clone [https://github.com/FlavioEduardo92/ExerciciosJava.git](https://github.com/FlavioEduardo92/ExerciciosJava.git)

# 2. Navegue até a pasta do projeto
cd ExerciciosJava

# 3. Navegue até a pasta dos fontes
cd src

# 4. Compile os arquivos Java
# (É importante compilar ambos os arquivos juntos)
javac ./Exercicios/ContaBancaria.java ./Exercicios/Main.java

# 5. Execute o programa principal
java Exercicios.conta.ContaBancaria.Main

# 6. Siga as instruções do menu interativo!
```

## 👨‍💻 Autor

Feito com ❤️ por **Flávio Eduardo**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/FlavioEduardo92)

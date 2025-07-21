package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // PASSO 1: A CONTA COMEÇA COMO NULL. NÃO EXISTE AINDA.
        ContaBancaria conta = null;

        int opcao = 0;
        // O loop agora vai até a opção 8 (Sair)
        while (opcao != 8) {
            System.out.println("\n=========== MENU DE OPÇÕES ===========");
            System.out.println("1. Criar Conta Bancária");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Consultar Cheque Especial");
            System.out.println("4. Depositar Dinheiro");
            System.out.println("5. Sacar Dinheiro");
            System.out.println("6. Pagar um Boleto");
            System.out.println("7. Verificar se está usando Cheque Especial");
            System.out.println("8. Sair");
            System.out.println("======================================");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                double valor; // Variável auxiliar

                switch (opcao) {
                    // DENTRO DO SWITCH, VERIFIQUE SE O SEU CASE 1 ESTÁ IGUAL A ESTE:

                    case 1:
                        if (conta != null) {
                            System.out.println("\nErro: Uma conta já foi criada nesta sessão.");
                        } else {
                            System.out.print("\nPara criar a conta, digite o valor do depósito inicial: R$ ");
                            valor = scanner.nextDouble();

                            if (valor < 0) {
                                System.out.println("Depósito inicial não pode ser negativo.");
                            } else {
                                // 1. Cria uma instância VAZIA da conta usando o construtor padrão
                                conta = new ContaBancaria();

                                // 2. Define o saldo inicial da conta usando o setter
                                conta.setSaldo(valor);

                                // 3. A LÓGICA DO CONSTRUTOR AGORA ESTÁ AQUI, NO MAIN:
                                double limiteCalculado;
                                if (valor <= 500.0) {
                                    limiteCalculado = 50.0;
                                } else {
                                    limiteCalculado = valor * 0.5;
                                }

                                // 4. Define o cheque especial calculado na conta usando o setter
                                conta.setChequeEspecial(limiteCalculado);

                                System.out.println("\nConta criada com sucesso!");

                                System.out.println("--- Resumo da Conta Recém-Criada ---");
                                conta.consultarSaldo();
                                conta.consultarChequeEspecial(); // <--- Mude para este método
                                System.out.println("------------------------------------");
                            }
                        }
                        break;

                    case 2: // --- CONSULTAR SALDO ---
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            conta.consultarSaldo();
                        }
                        break;

                    case 3:
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            conta.consultarChequeEspecial(); // <--- Mude para este método
                        }
                        break;

                    case 4: // --- DEPOSITAR ---
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            valor = scanner.nextDouble();
                            conta.depositarDinheiro(valor);
                        }
                        break;

                    case 5: // --- SACAR ---
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            valor = scanner.nextDouble();
                            conta.sacarDinheiro(valor);
                        }
                        break;

                    case 6: // --- PAGAR BOLETO ---
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            System.out.print("Digite o valor do boleto a ser pago: R$ ");
                            valor = scanner.nextDouble();
                            conta.pagarBoleto(valor);
                        }
                        break;

                    case 7: // --- VERIFICAR USO CHEQUE ESPECIAL ---
                        if (conta == null) {
                            System.out.println("\nErro: Você precisa criar uma conta primeiro (Opção 1).");
                        } else {
                            conta.isVerificarUsoChequeEspecial();
                        }
                        break;

                    case 8: // --- SAIR ---
                        System.out.println("\nObrigado por usar nosso banco. Sessão encerrada.");
                        break;

                    default:
                        System.out.println("\nOpção inválida! Por favor, escolha um número entre 1 e 8.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer
                opcao = 0; // Reseta a opção
            }
        }

        scanner.close();
    }
}
package Exercicios.conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private boolean verificarUsoChequeEspecial;


    // construtor padrão.
    public ContaBancaria() {
        this.saldo = 0.0;
        this.chequeEspecial = 0.0;
    }

    public void depositarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return; // Encerra a execução do método
        }

        double saldoAnterior = this.saldo;
        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.\n", valor);

        if (saldoAnterior < 0) {
            double valorDaDividaCoberto = Math.min(Math.abs(saldoAnterior), valor);
            double taxa = valorDaDividaCoberto * 0.20;
            this.saldo -= taxa;
            System.out.println("\n--- COBRANÇA DE TAXA POR USO DO CHEQUE ESPECIAL ---");
            System.out.printf("Valor da dívida coberto neste depósito: R$ %.2f\n", valorDaDividaCoberto);
            System.out.printf("Taxa de 20%% sobre o valor coberto: - R$ %.2f\n", taxa);
            System.out.println("---------------------------------------------------");
        }

        System.out.printf("Saldo final atualizado: R$ %.2f\n", this.saldo);
    }

    public void sacarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        if (valor > this.saldo + this.chequeEspecial) {
            System.out.println("Saldo e limite de cheque especial insuficientes.");
        } else {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.\n", valor);
            System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("\n--- Pagando Boleto ---");
        sacarDinheiro(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("---------------------------------");
        if (this.saldo >= 0) {
            System.out.printf("Saldo disponível: R$ %.2f\n", this.saldo);
        } else {
            // Se o saldo for negativo, informa o valor usado do cheque especial
            System.out.println("Saldo em conta: R$ 0.00");
            System.out.printf("Valor utilizado do cheque especial: R$ %.2f\n", Math.abs(this.saldo));
        }
        System.out.println("---------------------------------");
    }

    public void consultarChequeEspecial() {
        double valorUsado = 0;
        if (this.saldo < 0) {
            valorUsado = Math.abs(this.saldo);
        }
        double disponivel = this.chequeEspecial - valorUsado;

        System.out.println("\n--- STATUS DO CHEQUE ESPECIAL ---");
        System.out.printf("Limite Total: R$ %.2f\n", this.chequeEspecial);
        System.out.printf("Valor Utilizado: R$ %.2f\n", valorUsado);
        System.out.printf("Valor Disponível: R$ %.2f\n", disponivel);
        System.out.println("---------------------------------");

    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void isVerificarUsoChequeEspecial() {
        if (this.saldo < 0) {
            System.out.println("A conta está usando o cheque especial.");
        } else {
            System.out.println("A conta não está usando o cheque especial.");
        }

    }

    public static class Main {

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
}


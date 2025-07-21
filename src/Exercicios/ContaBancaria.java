package Exercicios;

//todos os execicios devem ter um menu de interativo para chamar as funções e ter uma opção de sair para finalizar a execução
//Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
//Consultar saldo
//consultar cheque especial
//Depositar dinheiro;
//Sacar dinheiro;
//Pagar um boleto.
//Verificar se a conta está usando cheque especial.
//Siga as seguintes regras para implementar
//
//A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
//O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
//Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
//Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
//Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.


public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private boolean verificarUsoChequeEspecial;git


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
}


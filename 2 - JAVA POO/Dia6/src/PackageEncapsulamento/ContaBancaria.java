package PackageEncapsulamento;

public class ContaBancaria {
    private double saldo;

    // Método construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para realizar um depósito
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para realizar um saque
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo após saque: " + conta.getSaldo());
    }
}

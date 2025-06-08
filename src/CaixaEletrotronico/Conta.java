package CaixaEletrotronico;

public class Conta {

    private int numeroConta;
    private double saldo;



    public Conta(double saldo, int numeroConta){

        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void saque(double saldoRetirar){

        if (saldoRetirar <= saldo) {

            saldo -= saldoRetirar;
            System.out.printf("Saque de R$%.2f realizado com sucesso.", saldoRetirar);
        }else{

            System.out.println("Saque não realizado");
        }
    }

    public void deposito(double saldoDepositar){

        saldo += saldoDepositar;
        System.out.println("Depósito realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String toString(){
        return "Conta " + numeroConta;
    }
}

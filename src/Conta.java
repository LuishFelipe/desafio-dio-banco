public abstract class Conta {
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    protected void infoComuns(){
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numeroConta);
        System.out.printf("Saldo: %2f%n", this.saldo);
    }

    public Conta(Cliente cliente, int agencia) {
        this.agencia = agencia;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDeposito){
        this.sacar(valor);
        contaDeposito.depositar(valor);
    }


}

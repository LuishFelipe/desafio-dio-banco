public class ContaPoupanca extends Conta{
    private static final int AGENCIA_PADRAO = 2;
    public ContaPoupanca(Cliente cliente) {
        super(cliente, AGENCIA_PADRAO);
    }

    public void imprimirExtrato() {
        System.out.println("-----------Conta Poupança-----------");
        super.infoComuns();
    }
}

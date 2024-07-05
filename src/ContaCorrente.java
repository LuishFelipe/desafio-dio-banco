public class ContaCorrente extends Conta{
    private static final int AGENCIA_PADRAO = 1;

    public ContaCorrente(Cliente cliente) {
        super(cliente, AGENCIA_PADRAO);
    }

    public void imprimirExtrato(){
        System.out.println("-----------Conta Corrente-----------");
        super.infoComuns();
    }
}

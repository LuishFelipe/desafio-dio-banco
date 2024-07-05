public class Main {
    public static void main(String[] args) {
        Cliente Cleyton = new Cliente("Cleyton","111111111");
        Cliente Roberto = new Cliente("Roberto","222222222");

        Banco b3 = new Banco("Bolsa, Balcao, Bosta");
        b3.criarContaCorrente(Cleyton);
        b3.criarContaCorrente(Cleyton);
        b3.criarContaPoupanca(Cleyton);
        b3.criarContaCorrente(Roberto);
    }
}

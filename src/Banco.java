import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void criarContaCorrente(Cliente cliente){
        if(contas.isEmpty()){
            contas.add(new ContaCorrente(cliente));
            System.out.println("Primeira conta corrente criada para esse banco");
        }else{
            if(!contaCorrenteAlreadyExists(cliente)){
                contas.add(new ContaCorrente(cliente));
                System.out.println("Conta corrente criada para o cliente " + cliente.getNome());
            }
        }
    }

    public void criarContaPoupanca(Cliente cliente){
        if(contas.isEmpty()){
            contas.add(new ContaPoupanca(cliente));
            System.out.println("Primeira conta criada para esse banco");
        }else{
            if(!contaPoupancaAlreadyExists(cliente)){
                contas.add(new ContaPoupanca(cliente));
                System.out.println("Conta poupanca criada para o cliente " + cliente.getNome());
            }
        }
    }

    private boolean contaPoupancaAlreadyExists(Cliente cliente){
        for(Conta cc : contas){
            if(cc.cliente.equals(cliente) && cc.agencia == 2){
                return true;
            }
        }
        return false;
    }

    private boolean contaCorrenteAlreadyExists(Cliente cliente){
        for(Conta cc : contas){
            if(cc.cliente.equals(cliente) && cc.agencia == 1){
                return true;
            }
        }
        return false;
    }
}

package model.repository;
import java.util.ArrayList;
import java.util.List;
import model.IConta;
import model.Conta;


public class Banco implements IBanco {
    private List<IConta> contas = new ArrayList<>();
    
    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }
    
    public IConta buscarConta(int numero) {
        return contas.stream().filter(c -> ((Conta) c).numero == numero).findFirst().orElse(null);
    }
}
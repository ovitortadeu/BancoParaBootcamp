package view;

import controller.BancoController;
import controller.IBancoController;
import model.Cliente;
import model.repository.Banco;
import model.repository.IBanco;

public class Main {
	
    public static void main(String[] args) {
        IBanco banco = new Banco();
        IBancoController controller = new BancoController(banco);
        
        Cliente cliente1 = new Cliente("Vitor");
        Cliente cliente2 = new Cliente("Carlos");
        
        controller.criarContaCorrente(1, cliente1);
        controller.criarContaPoupanca(2, cliente2);
        
        controller.depositar(1, 1000);
        controller.transferir(1, 2, 200);
        
        System.out.println("Saldo conta 1: " + banco.buscarConta(1).getSaldo());
        System.out.println("Saldo conta 2: " + banco.buscarConta(2).getSaldo());
    }
}

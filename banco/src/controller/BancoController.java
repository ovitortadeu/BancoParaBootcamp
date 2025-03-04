package controller;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.IConta;
import model.repository.IBanco;

public class BancoController implements IBancoController {
    private IBanco banco;
    
    public BancoController(IBanco banco) {
        this.banco = banco;
    }
    
    @Override
    public void criarContaCorrente(int numero, Cliente cliente) {
        banco.adicionarConta(new ContaCorrente(numero, cliente));
    }
    
    @Override
    public void criarContaPoupanca(int numero, Cliente cliente) {
        banco.adicionarConta(new ContaPoupanca(numero, cliente));
    }
    
    @Override
    public void depositar(int numero, double valor) {
        IConta conta = banco.buscarConta(numero);
        if (conta != null) conta.depositar(valor);
    }
    
    @Override
    public void sacar(int numero, double valor) {
        IConta conta = banco.buscarConta(numero);
        if (conta != null) conta.sacar(valor);
    }
    
    @Override
    public void transferir(int origem, int destino, double valor) {
        IConta contaOrigem = banco.buscarConta(origem);
        IConta contaDestino = banco.buscarConta(destino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
        }
    }
}
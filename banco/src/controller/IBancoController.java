package controller;

import model.Cliente;

public interface IBancoController {
    void criarContaCorrente(int numero, Cliente cliente);
    void criarContaPoupanca(int numero, Cliente cliente);
    void depositar(int numero, double valor);
    void sacar(int numero, double valor);
    void transferir(int origem, int destino, double valor);
}
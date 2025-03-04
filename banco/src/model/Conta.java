package model;

public abstract class Conta implements IConta {
    protected double saldo;
    public int numero;
    protected Cliente cliente;
    
    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new RuntimeException("Saldo insuficiente.");
        }
    }
    
    @Override
    public void transferir(double valor, IConta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    
    @Override
    public double getSaldo() {
        return saldo;
    }
}
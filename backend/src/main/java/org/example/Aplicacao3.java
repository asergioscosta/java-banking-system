package org.example;

public class Aplicacao3 {
    public static void main(String[] args) {

        Cliente c = new Cliente("12536652706", "João", "32985576224");
        System.out.println("O nome do Cliente é: " + c.getNome());

        ContaCorrente cc = new ContaCorrente("2564");
        cc.setLimite(0.00);
        cc.depositar(100.0);
        cc.depositar(100.0);
        cc.depositar(100.0);

        cc.sacar(50.0);
        System.out.println("O saldo final da conta é: " + cc.calcularSaldo());
    }
}
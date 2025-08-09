package org.example;

public class Aplicacao4 {

    public static void main(String[] args) {

        Cliente c = new Cliente("12536652706", "Maria", "32587592238");
        System.out.println("O nome do Cliente é: " + c.getNome());

        ContaCorrente cc = new ContaCorrente("2564");
        cc.setLimite(0.00);
        cc.depositar(1000.0);

        Cliente c2 = new Cliente("12536652706", "Marcos", "3298575625");
        System.out.println("O nome do Cliente 2 é: " + c2.getNome());

        ContaPoupanca cp = new ContaPoupanca("4682");
        cp.depositar(1000.0);

        cc.transferir(500.00, cp);

        System.out.println("O saldo final da conta corrente é: " + cc.calcularSaldo());
        System.out.println("O saldo final da conta poupança é: " + cp.calcularSaldo());
    }
}
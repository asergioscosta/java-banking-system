package org.example;

public class Aplicacao1 {

    public static void main(String[] args) {

        Funcionario a = new Funcionario("58624525135", "Augusto", "32985475256");
        System.out.println("O nome do Funcionário é: " + a.getNome());

        Funcionario g = new Funcionario("22222222222", "Victor", "32888888888");
        System.out.println("O nome do Gerente é: " + g.getNome());
    }
}
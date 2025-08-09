package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Pessoa implements IUsuario {

    private Double salario;
    private Collection<Cargo> cargo = new ArrayList<Cargo>();

    public Funcionario(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public void retornaValidacao() {
        if (!this.autenticar()) {
            System.out.println("Funcionario Inválido: " + getNome());
        }
    }

    @Override
    public boolean autenticar() {
        return false;
    }
}
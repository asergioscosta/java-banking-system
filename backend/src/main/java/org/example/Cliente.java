package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente extends Pessoa implements IUsuario {

    private Boolean vip;

    private ArrayList<Conta> listaConta = new ArrayList<Conta>();
    private ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public void retornaValidacao() {
    }

    @Override
    public boolean autenticar() {
        return false;
    }
}
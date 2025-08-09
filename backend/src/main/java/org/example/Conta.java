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
public class Conta {
    private String numero;

    private ArrayList<Credito> listaCredito = new ArrayList<Credito>();
    private ArrayList<Debito> listaDebito = new ArrayList<Debito>();

    public Conta(String numero) {
        this.numero = numero;
    }

    public void addCredito(Credito credito) {
        this.listaCredito.add(credito);
    }

    public void addDebito(Debito debito) {
        this.listaDebito.add(debito);
    }

    public void depositar(Double valor) {
        Credito credito = new Credito(this);
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        Debito debito = new Debito(this);
        debito.setValor(valor);
        this.addDebito(debito);
    }
}
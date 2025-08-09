package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupanca extends Conta {

    private Double rentabilidademensal;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public Double getRentabilidademensal() {
        return rentabilidademensal;
    }

    public void setRentabilidademensal(Double rentabilidademensal) {
        this.rentabilidademensal = rentabilidademensal;
    }

    public void sacar(Double valor) {
        if (calcularSaldo() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            super.sacar(valor);
        }
    }

    public Double calcularsaldocontapoupancac() {
        Double total = 0.0;
        for (Credito c : this.getListaCredito()) {
            total += c.getValor();
        }
        return total;
    }

    public Double calcularsaldocontapoupancad() {
        Double total = 0.0;
        for (Debito d : this.getListaDebito()) {
            total += d.getValor();
        }
        return total;
    }

    public Double calcularSaldo() {
        return (this.calcularsaldocontapoupancac() - this.calcularsaldocontapoupancad());
    }
}
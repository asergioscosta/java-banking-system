package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Debito {
    private Double valor;
    private Conta conta;

    public Debito(Conta conta) {
        this.setConta(conta);
    }
}
package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private String nome;
    private Collection<Funcionario> funcionario = new ArrayList<Funcionario>();
}
package org.example.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public void apresentarPopulacao() {
        System.out.println("A cidade de " + nome + " tem uma população de " + populacao + " habitantes.");
    }

    public void fundar() {
        System.out.println("A cidade de " + nome + " foi fundada.");
    }

    public void celebrarFeriado() {
        System.out.println("A cidade de " + nome + " está celebrando um feriado.");
    }
}


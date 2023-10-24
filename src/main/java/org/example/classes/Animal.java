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
public class Animal {
    private String especie;
    private String cor;
    private int idade;

    public void fazerSom() {
        System.out.println("O " + especie + " fez um som!");
    }

    public void comer() {
        System.out.println("O " + especie + " está comendo.");
    }

    public void dormir() {
        System.out.println("O " + especie + " está dormindo.");
    }
}


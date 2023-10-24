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
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public void buzinar() {
        System.out.println("Beep! Beep! Eu sou um " + marca + " " + modelo);
    }

    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    public void parar() {
        System.out.println("O carro " + marca + " " + modelo + " parou.");
    }
}

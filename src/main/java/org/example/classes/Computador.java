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
public class Computador {
    private String marca;
    private String processador;
    private int memoriaRAM;

    public void ligar() {
        System.out.println("Ligando o computador da marca " + marca + "...");
    }

    public void desligar() {
        System.out.println("Desligando o computador da marca " + marca + "...");
    }

    public void reiniciar() {
        System.out.println("Reiniciando o computador da marca " + marca + "...");
    }
}


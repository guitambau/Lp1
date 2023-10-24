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
public class Telefone {
    private String numero;
    private String marca;
    private String modelo;

    public void fazerChamada() {
        System.out.println("Ligando para o número: " + numero);
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    public void vibrar() {
        System.out.println("O telefone está vibrando.");
    }
}


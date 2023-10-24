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
public class Artista {
    private String nome;
    private String estilo;
    private int albunsLancados;

    public void cantar() {
        System.out.println(nome + " está cantando no estilo " + estilo);
    }

    public void compor() {
        System.out.println(nome + " está compondo uma nova música.");
    }

    public void ensaiar() {
        System.out.println(nome + " está ensaiando para o próximo show.");
    }
}


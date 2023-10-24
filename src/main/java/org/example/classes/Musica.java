package org.example.classes;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Musica {
    private String titulo;
    private String artista;
    private String duracao;

    public void tocar() {
        System.out.println("Tocando a música: " + titulo + " de " + artista);
    }

    public void pausar() {
        System.out.println("Música pausada: " + titulo);
    }

    public void avancar() {
        System.out.println("Avançando a música: " + titulo);
    }
}

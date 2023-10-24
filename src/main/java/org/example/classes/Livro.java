package org.example.classes;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    private String titulo;
    private String autor;
    private String genero;

    public void ler() {
        System.out.println("Lendo o livro: " + titulo);
    }

    public void fechar() {
        System.out.println("Fechando o livro: " + titulo);
    }

    public void abrir() {
        System.out.println("Abrindo o livro: " + titulo);
    }
}


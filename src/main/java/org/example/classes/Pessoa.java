package org.example.classes;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + profissao + ".");
    }

    public void comemorarAniversario() {
        idade++;
        System.out.println(nome + " agora tem " + idade + " anos.");
    }
}

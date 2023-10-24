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
public class Planta {
    private String tipo;
    private String cor;
    private double altura;

    public void realizarFotossintese() {
        System.out.println("A " + tipo + " está realizando fotossíntese.");
    }

    public void crescer() {
        this.altura += 0.5;  // Crescimento exemplificado
        System.out.println("A " + tipo + " cresceu e agora tem " + altura + " metros.");
    }

    public void murchar() {
        System.out.println("A " + tipo + " está murchando.");
    }
}


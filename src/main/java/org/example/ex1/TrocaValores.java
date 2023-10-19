package org.example.ex1;

public class TrocaValores {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int auxiliar;

        // Trocando os valores
        auxiliar = A;
        A = B;
        B = auxiliar;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
    }
}

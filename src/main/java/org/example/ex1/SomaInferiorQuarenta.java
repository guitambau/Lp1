package org.example.ex1;

import java.util.Scanner;

public class SomaInferiorQuarenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números inferiores a 40: " + soma);
    }
}

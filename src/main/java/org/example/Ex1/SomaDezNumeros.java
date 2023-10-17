package org.example.Ex1;

import java.util.Scanner;

public class SomaDezNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        System.out.println("Soma total dos 10 números: " + soma);
    }
}

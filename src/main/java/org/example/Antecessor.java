package org.example;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        System.out.println("O antecessor de " + valor + " é " + (valor - 1));
    }
}


package org.example.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex83 {

    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 20 números:");
        while (numeros.size() < 20) {
            try {
                System.out.print("Número " + (numeros.size() + 1) + ": ");
                numeros.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        Collections.reverse(numeros); // Inverte a ordem da lista

        System.out.println("Números na ordem inversa:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números:");
        for (int i = 0; i < numeros.length; ) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        System.out.println("Números na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}

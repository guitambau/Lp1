package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex87 {
    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros.add(scanner.nextInt());
        }

        // Ordenando a lista
        Collections.sort(numeros);

        System.out.println("Digite mais um número:");
        int novoNumero = scanner.nextInt();

        // Encontrando a posição correta para inserção
        int i = 0;
        while (i < numeros.size() && numeros.get(i) < novoNumero) {
            i++;
        }

        numeros.add(i, novoNumero);

        System.out.println("Lista com inserção ordenada:");
        numeros.forEach(num -> System.out.print(num + " "));

        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenando o array
        Arrays.sort(numeros);

        System.out.println("Digite mais um número:");
        int novoNumero = scanner.nextInt();

        // Encontrando a posição correta para inserção
        int[] novoArray = new int[11];
        int i = 0;
        while (i < 10 && numeros[i] < novoNumero) {
            novoArray[i] = numeros[i];
            i++;
        }

        novoArray[i] = novoNumero;

        while (i < 10) {
            novoArray[i + 1] = numeros[i];
            i++;
        }

        System.out.println("Vetor com inserção ordenada:");
        for (int num : novoArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

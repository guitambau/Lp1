package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex86 extends ArrayListImp {

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

        System.out.println("Lista ordenada:");
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

        System.out.println("Vetor ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

}

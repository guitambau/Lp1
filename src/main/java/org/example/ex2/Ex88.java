package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex88 {
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
        for (int i = 0; i < 20; i++) {
            numeros.add(scanner.nextInt());
        }

        System.out.println("Digite um número para verificar se existe na lista:");
        int numeroParaVerificar = scanner.nextInt();

        // Verificando se o número existe na lista
        if (numeros.contains(numeroParaVerificar)) {
            // Se o número existir, removemos esse número
            numeros.remove(Integer.valueOf(numeroParaVerificar));

            System.out.println("O número " + numeroParaVerificar + " existe na lista. Nova lista:");
            numeros.forEach(num -> System.out.print(num + " "));
        } else {
            System.out.println("O número " + numeroParaVerificar + " não existe na lista.");
        }

        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int posicaoDoNumero = -1; // A posição do número a ser removido no vetor

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Digite um número para verificar se existe no vetor:");
        int numeroParaVerificar = scanner.nextInt();

        // Verificando se o número existe no vetor
        for (int i = 0; i < 20; i++) {
            if (numeros[i] == numeroParaVerificar) {
                posicaoDoNumero = i;
                break;
            }
        }

        if (posicaoDoNumero != -1) {
            int[] novoVetor = new int[19];
            for (int i = 0, j = 0; i < 20; i++) {
                if (i == posicaoDoNumero) continue;
                novoVetor[j++] = numeros[i];
            }

            System.out.println("O número " + numeroParaVerificar + " existe no vetor. Novo vetor:");
            for (int num : novoVetor) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("O número " + numeroParaVerificar + " não existe no vetor.");
        }

        scanner.close();
    }
}

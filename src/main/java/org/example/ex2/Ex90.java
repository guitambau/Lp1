package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int contagemOcorrencias = 0;

        // Preenchendo a lista
        System.out.println("Digite 30 números para preencher a lista:");
        for (int i = 0; i < 30; i++) {
            lista.add(scanner.nextInt());
        }

        // Lendo o número a ser verificado
        System.out.println("Digite um número para verificar sua ocorrência na lista:");
        int numeroVerificar = scanner.nextInt();

        // Verificando ocorrências na lista
        for (int numero : lista) {
            if (numero == numeroVerificar) {
                contagemOcorrencias++;
            }
        }

        System.out.println("O número " + numeroVerificar + " aparece " + contagemOcorrencias + " vezes na lista.");
        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[30];
        int contagemOcorrencias = 0;

        // Preenchendo o vetor
        System.out.println("Digite 30 números para preencher o vetor:");
        for (int i = 0; i < 30; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Lendo o número a ser verificado
        System.out.println("Digite um número para verificar sua ocorrência no vetor:");
        int numeroVerificar = scanner.nextInt();

        // Verificando ocorrências no vetor
        for (int i = 0; i < 30; i++) {
            if (vetor[i] == numeroVerificar) {
                contagemOcorrencias++;
            }
        }

        System.out.println("O número " + numeroVerificar + " aparece " + contagemOcorrencias + " vezes no vetor.");
        scanner.close();
    }
}

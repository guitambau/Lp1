package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        int contagemPosicoesIguais = 0;

        // Preenchendo a lista v1
        System.out.println("Digite 15 números para a lista V1:");
        for (int i = 0; i < 15; i++) {
            v1.add(scanner.nextInt());
        }

        // Preenchendo a lista v2
        System.out.println("Digite 15 números para a lista V2:");
        for (int i = 0; i < 15; i++) {
            v2.add(scanner.nextInt());
        }

        // Comparando as listas
        for (int i = 0; i < 15; i++) {
            if (v1.get(i).equals(v2.get(i))) {
                contagemPosicoesIguais++;
            }
        }

        System.out.println("Quantidade de posições com o mesmo número: " + contagemPosicoesIguais);
        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[15];
        int[] v2 = new int[15];
        int contagemPosicoesIguais = 0;

        // Preenchendo o vetor v1
        System.out.println("Digite 15 números para o vetor V1:");
        for (int i = 0; i < 15; i++) {
            v1[i] = scanner.nextInt();
        }

        // Preenchendo o vetor v2
        System.out.println("Digite 15 números para o vetor V2:");
        for (int i = 0; i < 15; i++) {
            v2[i] = scanner.nextInt();
        }

        // Comparando os vetores
        for (int i = 0; i < 15; i++) {
            if (v1[i] == v2[i]) {
                contagemPosicoesIguais++;
            }
        }

        System.out.println("Quantidade de posições com o mesmo número: " + contagemPosicoesIguais);
        scanner.close();
    }
}

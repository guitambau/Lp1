package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex91 {
    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vet = new ArrayList<>();

        // Preenchendo a lista
        System.out.println("Digite 50 números:");
        IntStream.range(0, 50).forEach(i -> vet.add(scanner.nextInt()));

        // Criando um mapa de valor para índices onde o valor ocorre
        var valueToIndexesMap = IntStream.range(0, vet.size())
                .boxed()
                .collect(Collectors.groupingBy(vet::get));

        // Filtrando valores que ocorrem mais de uma vez e exibindo seus índices
        valueToIndexesMap.forEach((value, indexes) -> {
            if (indexes.size() > 1) {
                System.out.println("Número " + value + " repetido nas posições " + indexes);
            }
        });

        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);
        int[] vet = new int[50];

        // Preenchendo o vetor
        System.out.println("Digite 50 números:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = scanner.nextInt();
        }

        // Verificando números repetidos
        System.out.println("Números repetidos encontrados nas seguintes posições:");
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] == vet[j]) {
                    System.out.println("Número " + vet[i] + " repetido nas posições " + i + " e " + j);
                }
            }
        }

        scanner.close();
    }
}

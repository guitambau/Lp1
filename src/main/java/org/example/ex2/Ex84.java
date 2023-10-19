package org.example.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex84 extends ArrayListImp {

    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores:");
        int n = scanner.nextInt();

        List<Integer> a = readList(scanner, n, "Digite os elementos do vetor A:");
        List<Integer> b = readList(scanner, n, "Digite os elementos do vetor B:");

        List<Integer> soma = IntStream.range(0, n)
                .mapToObj(i -> a.get(i) + b.get(i))
                .collect(Collectors.toList());

        System.out.println("Vetor Soma:");
        soma.forEach(value -> System.out.print(value + " "));

        scanner.close();
    }


    public static void array() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores:");
        int n = scanner.nextInt();

        int[] a = readArray(scanner, n, "Digite os elementos do vetor A:");
        int[] b = readArray(scanner, n, "Digite os elementos do vetor B:");

        int[] soma = IntStream.range(0, n).map(i -> a[i] + b[i]).toArray();

        System.out.println("Vetor Soma:");
        Arrays.stream(soma).forEach(value -> System.out.print(value + " "));

        scanner.close();
    }


}

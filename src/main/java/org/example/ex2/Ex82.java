package org.example.ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex82 {

    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista(){
        Scanner scanner = new Scanner(System.in);

        List<Integer> A = new ArrayList<>();
        List<Integer> M = new ArrayList<>();
        int X;

        System.out.println("Digite 10 números para o vetor A:");
        while (A.size() < 10) {
            try {
                System.out.print("Número " + (A.size() + 1) + ": ");
                A.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        System.out.print("Digite um número X: ");
        while (true) {
            try {
                X = scanner.nextInt();
                break; // sair do loop se um número válido for inserido
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        for (int numero : A) {
            M.add(numero * X);
        }

        System.out.print("Vetor M: ");
        for (int numero : M) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }

    public static void array(){
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] M = new int[10];
        int X;

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < A.length; ) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                A[i] = scanner.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        System.out.print("Digite um número X: ");
        while (true) {
            try {
                X = scanner.nextInt();
                break; // sair do loop se um número válido for inserido
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        for (int i = 0; i < A.length; i++) {
            M[i] = A[i] * X;
        }

        System.out.print("Vetor M: ");
        for (int numero : M) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}

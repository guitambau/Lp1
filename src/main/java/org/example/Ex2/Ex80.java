package org.example.Ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex80 implements ArrayListImp{
    void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    @Override
    public void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> Q = new ArrayList<>();
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaior = -1;

        System.out.println("Digite 20 números positivos:");
        while (Q.size() < 20) {
            try {
                System.out.print("Número " + (Q.size() + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero >= 0) {
                    Q.add(numero);

                    if (numero > maiorValor) {
                        maiorValor = numero;
                        posicaoMaior = Q.size() - 1;
                    }
                } else {
                    System.out.println("Por favor, insira apenas números positivos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        System.out.println("O maior número é " + maiorValor + " e está na posição " + (posicaoMaior + 1));
        scanner.close();
    }

    @Override
    public void array() {
        Scanner scanner = new Scanner(System.in);
        int[] Q = new int[20];
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaior = -1;

        System.out.println("Digite 20 números positivos:");
        for (int i = 0; i < Q.length; ) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero >= 0) {
                    Q[i] = numero;

                    if (numero > maiorValor) {
                        maiorValor = numero;
                        posicaoMaior = i;
                    }

                    i++; // Só incrementa i se um número válido for inserido
                } else {
                    System.out.println("Por favor, insira apenas números positivos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // limpa o scanner
            }
        }

        System.out.println("O maior número é " + maiorValor + " e está na posição " + (posicaoMaior + 1));
        scanner.close();
    }
}

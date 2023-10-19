package org.example.ex1;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite os dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("A idade em dias é: " + totalDias);
    }
}


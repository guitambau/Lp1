package org.example.ex1;

import java.util.Scanner;

public class SaldoConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;
        System.out.println("Saldo atual: " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}


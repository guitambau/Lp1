package org.example;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas: ");
        double vendas = scanner.nextDouble();

        double comissao;
        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05);
        }

        double salarioTotal = salarioFixo + comissao;
        System.out.println("Salário total: " + salarioTotal);
    }
}


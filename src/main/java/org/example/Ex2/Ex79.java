package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex79 implements ArrayListImp {
    void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }
    @Override
    public void lista() {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double soma = 0;

        // leitura das notas
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
        }

        // calculando a média
        double media = soma / notas.size();

        // contando notas acima da média
        int count = 0;
        for (double nota : notas) {
            if (nota > media) {
                count++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos com nota acima da média: " + count);
        scanner.close();
    }

    @Override
    public void array() {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];
        double soma = 0;

        // leitura das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // calculando a média
        double media = soma / notas.length;

        // contando notas acima da média
        int count = 0;
        for (double nota : notas) {
            if (nota > media) {
                count++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos com nota acima da média: " + count);
        scanner.close();
    }
}

package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex78 implements ArrayListImp{
    void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    @Override
    public void lista() {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        // leitura dos nomes de 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        // leitura de mais 1 nome
        System.out.println("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        // verificação se o nome está na lista
        if (nomes.contains(nomeBusca)) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }

    @Override
    public void array() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        // leitura dos nomes de 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // leitura de mais 1 nome
        System.out.println("Digite um nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        // verificação se o nome está no array
        boolean achei = false;
        for (String nome : nomes) {
            if (nomeBusca.equals(nome)) {
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}

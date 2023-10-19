package org.example.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex85 extends ArrayListImp {

    public static void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }

    public static void lista() {
        final int DIAS_NO_ANO = 365;
        List<Double> temperaturas = new ArrayList<>();
        Random random = new Random();

        // Preenchendo a lista com temperaturas aleatórias entre -10.0 (inclusivo) e 35.0 (exclusivo) para exemplo
        for (int i = 0; i < DIAS_NO_ANO; i++) {
            temperaturas.add(-10.0 + (35.0 - (-10.0)) * random.nextDouble());
        }

        double menorTemperatura = temperaturas.stream().min(Double::compare).get();
        double maiorTemperatura = temperaturas.stream().max(Double::compare).get();
        double mediaAnual = temperaturas.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

        long diasInferioresMediaAnual = temperaturas.stream().filter(temp -> temp < mediaAnual).count();

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasInferioresMediaAnual);
    }


    public static void array() {
        final int DIAS_NO_ANO = 365;
        double[] temperaturas = new double[DIAS_NO_ANO];
        Random random = new Random();

        // Preenchendo o array com temperaturas aleatórias entre -10.0 (inclusivo) e 35.0 (exclusivo) para exemplo
        for (int i = 0; i < DIAS_NO_ANO; i++) {
            temperaturas[i] = -10.0 + (35.0 - (-10.0)) * random.nextDouble();
        }

        double menorTemperatura = Arrays.stream(temperaturas).min().getAsDouble();
        double maiorTemperatura = Arrays.stream(temperaturas).max().getAsDouble();
        double mediaAnual = Arrays.stream(temperaturas).average().getAsDouble();

        long diasInferioresMediaAnual = Arrays.stream(temperaturas).filter(temp -> temp < mediaAnual).count();

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasInferioresMediaAnual);
    }

}

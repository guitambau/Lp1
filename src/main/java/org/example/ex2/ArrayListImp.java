package org.example.ex2;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class ArrayListImp {

    public static List<Integer> readList(Scanner scanner, int size, String prompt) {
        System.out.println(prompt);
        return IntStream.range(0, size).mapToObj(i -> scanner.nextInt()).collect(Collectors.toList());
    }

    static int[] readArray(Scanner scanner, int size, String prompt) {
        System.out.println(prompt);
        return IntStream.range(0, size).map(i -> scanner.nextInt()).toArray();
    }
}

package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex77 implements ArrayListImp {

    void main(String[] args) {
        System.out.println("Iniciando Array List");
        array();
//        System.out.println("Iniciando List");
//        lista();
    }
    @Override
    public void lista() {
        List<Integer> V = new ArrayList<>();
        // Adicionando elementos
        for (int i = 1; i <= 8; i++) {
            V.add(i);
        }

        // Para i de 8 até 5 passo -1
        for (int i = 8; i >= 5; i--) {
            int aux = V.get(i - 1);
            V.set(i - 1, V.get(8 - i));
            V.set(8 - i, aux);
        }

        V.set(2, V.get(0));
        V.set(V.get(2) - 1, V.get(V.get(1) - 1));

        // Imprimindo a lista final
        for (int i = 0; i < V.size(); i++) {
            System.out.print(V.get(i) + " ");
        }
    }

    @Override
    public void array() {
        int[] V = {1, 2, 3, 4, 5, 6, 7, 8};

        // Para i de 8 até 5 passo -1
        for (int i = 8; i >= 5; i--) {
            int aux = V[i - 1];
            V[i - 1] = V[8 - i];
            V[8 - i] = aux;
        }

        V[2] = V[0];
        V[V[2] - 1] = V[V[1] - 1];

        // Imprimindo o vetor final
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
    }
}

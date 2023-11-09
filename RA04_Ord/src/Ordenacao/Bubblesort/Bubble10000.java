package Ordenacao.Bubblesort;

import Ordenacao.ArrayAleatorio;

public class Bubble10000 {
    public static void main(String[] args) {
        int [] array = ArrayAleatorio.gerar(10000);

        System.out.println("Array não ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        long start = System.currentTimeMillis();

        int [] resultado = Bubblesort.sort(array);

        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("Trocas: " + resultado[0]);
        System.out.println("Iterações: " + resultado[1]);
        System.out.println("Tempo de execução: "+(end - start));
    }
}

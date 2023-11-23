package Ordenacao.Quicksort;

import Ordenacao.ArrayAleatorio;

public class Quick5000 {
    public static void main(String[] args) {
        int tam = 5000;
        int [] array = ArrayAleatorio.gerar(tam);

        System.out.println("Array não ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        long start = System.currentTimeMillis();

        int [] resultado = Quicksort.sort(array, 0, tam - 1);

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

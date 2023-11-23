package Ordenacao.Bubblesort;

public class Bubblesort {

    public static int[] sort(int[] array, int tam) {
        int n = tam;
        int trocas = 0;
        int iteracoes = 0;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;
            for (int j = 0; j < n - 1 - i; j++) {
                iteracoes++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    troca = true;
                    trocas++;
                }
            }
            if (!troca) {
                break;
            }
        }

        int[] resultados = {trocas, iteracoes};
        return resultados;
    }

}

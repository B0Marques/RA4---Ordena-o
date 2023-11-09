package Ordenacao.Quicksort;

public class Quicksort {

    public static int[] sort(int[] array, int inferior, int superior) {
        int trocas = 0;
        int iteracoes = 0;
        if (inferior < superior) {
            int[] partitionResult = partition(array, inferior, superior);
            int pivotIndex = partitionResult[0];
            trocas = partitionResult[1];
            iteracoes = partitionResult[2];

            int[] esqResult = sort(array, inferior, pivotIndex - 1);
            int[] dirResult = sort(array, pivotIndex + 1, superior);

            trocas += esqResult[0] + dirResult[0];
            iteracoes += esqResult[1] + dirResult[1];
        }

        int[] resultados = { trocas, iteracoes };
        return resultados;
    }

    public static int[] partition(int[] array, int inferior, int superior) {
        int pivo = array[superior];
        int i = inferior - 1;
        int trocas = 0;
        int iteracoes = 0;

        for (int j = inferior; j < superior; j++) {
            iteracoes++;
            if (array[j] < pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                trocas++;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[superior];
        array[superior] = temp;
        trocas++;

        int[] resultados = { i + 1, trocas, iteracoes };
        return resultados;
    }

}

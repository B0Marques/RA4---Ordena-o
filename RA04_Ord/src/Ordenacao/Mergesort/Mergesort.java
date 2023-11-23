package Ordenacao.Mergesort;

public class Mergesort {

    public static int[] sort(int[] array, int tam) {
        int n = tam;
        int[] temp = new int[n];
        return sort(array, temp, 0, n - 1);
    }

    public static int[] sort(int[] array, int[] temp, int esq, int dir) {
        int trocas = 0;
        int iteracoes = 0;
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            int[] esqResult = sort(array, temp, esq, meio);
            int[] dirResult = sort(array, temp, meio + 1, dir);

            trocas += esqResult[0] + dirResult[0];
            iteracoes += esqResult[1] + dirResult[1];

            trocas += merge(array, temp, esq, meio, dir);
            iteracoes++;
        }

        int[] resultados = { trocas, iteracoes };
        return resultados;
    }

    public static int merge(int[] array, int[] temp, int esq, int meio, int dir) {
        int trocas = 0;
        int iteracoes = 0;
        for (int i = esq; i <= dir; i++) {
            temp[i] = array[i];
        }

        int i = esq;
        int j = meio + 1;
        int k = esq;

        while (i <= meio && j <= dir) {
            iteracoes++;
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
                trocas++;
            }
            k++;
        }

        while (i <= meio) {
            array[k] = temp[i];
            k++;
            i++;
        }

        return trocas;
    }

}

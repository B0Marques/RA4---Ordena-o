package Ordenacao;
import java.util.Random;


public class ArrayAleatorio {

    public static int[] gerar(int tam) {
        int[] array = new int[tam];
        Random random = new Random();
        for (int i = 0; i < tam; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}

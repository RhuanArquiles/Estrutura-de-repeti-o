
/**
 * Gere e imprima uma matriz M 4x4 com valores aleatórios
 * entre 0-9
 */

import java.util.Random;

public class desafio_10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizM = new int[4][4];

        // Navega dentro da matriz geral
        for (int i = 0; i < matrizM.length; i++) {
            // j -> representa os elementos da linha i
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(9);

            }

        }
        System.out.println("Matriz: ");
        for (int[] linha : matrizM) {
            // coluna está representando o elemento da coluna
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }
            System.out.println();

        }

    }

}

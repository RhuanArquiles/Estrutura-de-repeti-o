// faça um programa que peça N numeros inteiros
// calcule e mostre a quantidade de números pares
// e a quantidade de números impares.

import java.util.Scanner;

public class desafio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int contVezes = 0;
        int totalPar = 0, totalIm = 0;
        int numero;

        System.out.println("Quantos números você deseja analisar? : ");
        count = scan.nextInt();
        while (count <= 0) {
            System.out.println("Número inválido, digite outro número:");
            count = scan.nextInt();
        }
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            contVezes += 1;
            if (numero % 2 == 0)
                totalPar += 1;
            // totalPar++;
            else if (numero == 0)
                totalPar += 1;
            else {
                totalIm += 1;
                // totalIm++;
            }
        } while (contVezes < count);
        System.out.println("Total de números digitados: " + count);
        System.out.println("Total de números PARES: " + totalPar);
        System.out.println("Total de números ÍMPARES: " + totalIm);
    }
}

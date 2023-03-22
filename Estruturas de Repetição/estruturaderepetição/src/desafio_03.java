
// Faça um programa que leia 5 numeros e informe o maior número e a média desses números

import java.util.Scanner;

public class desafio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maiorNum = 0;
        int mediaNum = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count += 1;
            mediaNum += numero;
            if (numero > maiorNum)
                maiorNum = numero;
        } while (count < 5);

        System.out.println("Foram digitados: " + count + " números");
        System.out.println("O maior número digitado foi : " + maiorNum);
        System.out.println("A média dos números digitados foi: " + (mediaNum / count));
    }
}

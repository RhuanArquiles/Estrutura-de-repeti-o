
/** Faça um programa que leia o conjunto de dois valores */
import java.util.Scanner;

public class desafio_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0"))
                break;
            System.out.println("Idade: ");
            idade = scan.nextInt();

        }
        System.out.println("Espero que tenha gostado do programa!");
    }

}

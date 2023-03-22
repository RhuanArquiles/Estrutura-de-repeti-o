
// Faça um  programa que peça uma nota entre 0 e 10, se o valor digitado não corresponder, continue perguntando.
import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite outro número e tente novamente:");
            nota = scan.nextInt();

        }

        if (nota >= 7)
            System.out.println("Parabéns você foi aprovado no curso com a nota: " + nota);
        else if (nota <= 6)
            System.out.println("Você foi reprovado no curso com a nota: " + nota);
    }

}

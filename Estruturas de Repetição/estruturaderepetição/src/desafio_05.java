
// Pergunte pro usuário qual número ele deseja ver a tabudada;
import java.util.Scanner;

public class desafio_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número você deseja ver a tabuada? ");
        int number = scan.nextInt();

        while (number < 0 || number > 10) {

            System.out.println("Digite um número válido entre 0 e 10.");
            number = scan.nextInt();
        }

        System.out.println("Tabuada de: " + number);

        for (int count = 1; count <= 10; count += 1) {
            System.out.println(number + " X " + count + " = " + (number * count));

        }

    }
}

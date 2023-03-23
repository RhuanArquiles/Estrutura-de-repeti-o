import java.util.Scanner;

public class desafio_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para saber o fatorial dele: ");
        int number = scan.nextInt();

        int multiplication = 1;

        System.out.print("Fatorial de " + number + "! = ");
        for (int count = number; count >= 1; count -= 1) {

            multiplication *= count;

        }
        System.out.println(multiplication);
    }
}

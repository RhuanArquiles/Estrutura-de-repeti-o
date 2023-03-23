// Crie um vetor de 6 Números inteiros e mostre-os na ordem inversa

public class desafio_07 {
    public static void main(String[] args) {

        int[] vetor = { -7, 0, -15, 50, 8, 4 };

        System.out.print("Vetor original: ");
        int contador = 0;
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");

            contador += 1;

        }
        System.out.print("\nVetor invertido: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {

            System.out.print(vetor[i] + " ");
        }
    }
}

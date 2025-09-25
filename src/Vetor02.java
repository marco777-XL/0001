import java.util.Random;

public class Vetor02 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random rand = new Random();

        System.out.println("=== Atividade 2: Números Pares e Ímpares ===");
        System.out.print("Vetor gerado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1; // números de 1 a 100
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\n\nNúmeros pares: ");
        for (int n : vetor) {
            if (n % 2 == 0) System.out.print(n + " ");
        }

        System.out.print("\nNúmeros ímpares: ");
        for (int n : vetor) {
            if (n % 2 != 0) System.out.print(n + " ");
        }
    }
}
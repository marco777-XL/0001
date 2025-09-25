import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("=== Atividade 1: Maior e Menor Número ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int n : numeros) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        System.out.println("\nMaior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        sc.close();
    }
}
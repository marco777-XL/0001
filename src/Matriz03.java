import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("=== Atividade 3: Soma de Linhas e Colunas ===");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

        sc.close();
    }
}
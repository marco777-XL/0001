import java.util.Random;
import java.util.Scanner;

public class Matrizes05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char[][] mar = new char[7][7]; // Tabuleiro do mar
        int[][] navios = new int[3][2]; // Posições dos 3 navios

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '~';
            }
        }

        for (int n = 0; n < 3; n++) {
            int linha, coluna;
            boolean repetido;
            do {
                repetido = false;
                linha = rand.nextInt(7);
                coluna = rand.nextInt(7);

                for (int k = 0; k < n; k++) {
                    if (navios[k][0] == linha && navios[k][1] == coluna) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);

            navios[n][0] = linha;
            navios[n][1] = coluna;
        }

        int naviosAcertados = 0;

        System.out.println("=== Batalha Naval Simplificada ===");

        while (naviosAcertados < 3) {

            System.out.println("\nMar:");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(mar[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nDigite a linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-6): ");
            int coluna = sc.nextInt();

            boolean acerto = false;

            for (int i = 0; i < 3; i++) {
                if (navios[i][0] == linha && navios[i][1] == coluna) {
                    System.out.println("Acertou um navio!");
                    mar[linha][coluna] = 'X';
                    naviosAcertados++;
                    acerto = true;
                    break;
                }
            }

            if (!acerto) {
                System.out.println("Água!");
                mar[linha][coluna] = 'O';
            }
        }

        System.out.println("\nParabéns! Você encontrou todos os navios!");
        System.out.println("Tabuleiro final:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mar[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }//
}
import java.util.Random;

public class Matriz02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[4][4];

        System.out.println("=== Atividade 2: Diagonal Principal de uma Matriz 4x4 ===");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(99) + 1;
            }
        }

        System.out.println("\nMatriz gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Posição [" + i + "][" + i + "] = " + matriz[i][i]);
        }
    }
}
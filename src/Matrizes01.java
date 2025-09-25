public class Matrizes01 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        System.out.println("=== Atividade Desafiadora 1: Matriz Identidade 5x5 ===\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }///
}
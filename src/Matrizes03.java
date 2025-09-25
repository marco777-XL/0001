import java.util.Scanner;

public class Matrizes03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        boolean jogadorX = true;
        int jogadas = 0;

        System.out.println("=== Jogo da Velha (Lógica Inicial) ===");

        while (jogadas < 9) {
            exibirTabuleiro(tabuleiro);

            System.out.println("\nJogador " + (jogadorX ? "X" : "O") + ", escolha sua posição:");
            int linha, coluna;
            while (true) {
                System.out.print("Linha (0-2): ");
                linha = sc.nextInt();
                System.out.print("Coluna (0-2): ");
                coluna = sc.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    break;
                } else {
                    System.out.println("Posição inválida ou ocupada! Tente novamente.");
                }
            }

            tabuleiro[linha][coluna] = jogadorX ? 'X' : 'O';
            jogadorX = !jogadorX;
            jogadas++;
        }

        exibirTabuleiro(tabuleiro);
        System.out.println("\nFim de jogo! Tabuleiro completo.");
        sc.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + "|");
            }
            System.out.println();
        }//
    }
}
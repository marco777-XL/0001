import java.util.Scanner;

public class Matrizes04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[5];
        double[][] notas = new double[5][2];

        System.out.println("=== Atividade Desafiadora 4: Ranking de Notas ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota " + (j + 1) + " de " + alunos[i] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\n=== Médias dos Alunos ===");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println(alunos[i] + " - Média: " + media);
        }

        sc.close();
    }
}
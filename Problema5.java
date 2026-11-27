import java.util.Scanner;
import java.util.Arrays;

public class Problema5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[][] matriu = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = sc.nextLine();
            }
        }
        int[][] posicions = new int[n][2];

        for (int i = 0; i < n; i++) {
            int colMinima = 0;

            for (int j = 1; j < n; j++) {
                if (matriu[i][j].compareTo(matriu[i][colMinima]) <= 0) {
                    colMinima = j;
                }
            }
            posicions[i][0] = i;
            posicions[i][1] = colMinima;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(posicions[i]));
        }
        sc.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class Problema4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] paraules = new String[n];
        for (int i = 0; i < n; i++) {
            paraules[i] = sc.nextLine();
        }
        boolean[][] matriu = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = paraules[i].contains(paraules[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matriu[i]));
        }
        sc.close();
    }
}

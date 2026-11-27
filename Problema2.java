import java.util.Scanner;
import java.util.Arrays;

public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] paraules = new String[n];
        for (int i = 0; i < n; i++) {
            paraules[i] = sc.nextLine();
        }
        char lletra = sc.nextLine().charAt(0);
        int[] comptador = new int[n];

        for (int i = 0; i < n; i++) {
            int vegades = 0;
            for (int j = 0; j < paraules[i].length(); j++) {
                if (paraules[i].charAt(j) == lletra) {
                    vegades++;
                }
            }
            comptador[i] = vegades;
        }
        System.out.println(Arrays.toString(comptador));
        sc.close();
    }
}

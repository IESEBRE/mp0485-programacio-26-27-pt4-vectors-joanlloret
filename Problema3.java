import java.util.Scanner;
import java.util.Arrays;

public class Exercici3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] paraules = new String[n];
        boolean[] resultat = new boolean[n];

        for (int i = 0; i < n; i++) {
            paraules[i] = sc.nextLine();
            String primeraLletra = String.valueOf(paraules[i].charAt(0));

            if (paraules[i].startsWith(primeraLletra) && paraules[i].endsWith(primeraLletra)) {
                resultat[i] = true;
            } else {
                resultat[i] = false;
            }
        }
        System.out.println(Arrays.toString(resultat));
        sc.close();
    }
}

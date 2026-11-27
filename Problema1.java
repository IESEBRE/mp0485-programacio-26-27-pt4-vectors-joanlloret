import java.util.Scanner;
import java.util.Arrays;

public class Problema1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] paraules = new String[n];
        int[] longituds = new int[n];
        
        for (int i = 0; i < n; i++) {
            paraules[i] = sc.nextLine();
            longituds[i] = paraules[i].length();
        }
        
        System.out.println(Arrays.toString(paraules) + " -> " + Arrays.toString(longituds));

        sc.close();
    }

}

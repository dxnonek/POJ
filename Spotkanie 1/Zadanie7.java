import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        try {
            int n = skaner.nextInt();
            int m = skaner.nextInt();
            if (n != m || n <= 0){
                System.out.println("BLAD");
                return;
            }
            int[] A = new int[n];
            int[] B = new int[m];
            for (int i = 0; i < n; i++){
                A[i] = skaner.nextInt();
            }
            for (int i = 0; i < m; i++){
                B[i] = skaner.nextInt();
            }

            long wynik = 0;
            for (int i = 0; i < n; i++){
                wynik += (long) A[i] * B[i];
            }
            System.out.println(wynik);
        } catch (Exception e) {
            System.out.println("BLAD");
        }
    }
}
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        try {
            int a = skaner.nextInt();
            int b = skaner.nextInt();
            int[][] macierz = new int[a][b];

            for (int i = 0; i < a; i++){
                for (int j = 0; j < b; j++) {
                    macierz[i][j] = skaner.nextInt();
                }
            }

            for (int i = 0; i < b; i++){
                for (int j = 0; j < a; j++){
                    System.out.print(macierz[j][i] + (i == a - 1 ? "" : " "));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("BLAD");
        }
    }
}

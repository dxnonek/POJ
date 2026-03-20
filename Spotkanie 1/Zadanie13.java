import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int n = skaner.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) tab[i] = skaner.nextInt();
        System.out.println(Max(tab, n));
    }

    public static int Max(int[] tab, int n) {
        if (n == 1) return tab[0];
        return Math.max(tab[n - 1], Max(tab, n - 1));
    }
}

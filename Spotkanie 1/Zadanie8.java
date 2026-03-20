import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        int n;
        while (true){
            if (skaner.hasNextInt()){
                n = skaner.nextInt();
                if (n > 0) break;
            } else {
                skaner.next();
            }
        }

        for (int i = 1; i <= n; i++) System.out.println("*".repeat(i));
        for (int i = n; i >= 1; i--) System.out.println("*".repeat(i));
        for (int i = 0; i < n; i++) System.out.println(" ".repeat(i) + "*".repeat(n - i));
        for (int i = 1; i <= n; i++) System.out.println(" ".repeat(n - i) + "*".repeat(i));
    }
}
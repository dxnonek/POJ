import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        double a = skaner.nextDouble();
        double b = skaner.nextDouble();
        double c = skaner.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BLAD");
        } else if (a + b > c && a + c > b && b + c > a){
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
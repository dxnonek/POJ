import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        if (!skaner.hasNextInt()) {
            System.out.println("BLAD");
            return;
        }
        int miesiac = skaner.nextInt();
        switch (miesiac){
            case 1 -> System.out.println("Styczen: 31 dni");
            case 2 -> System.out.println("Luty: 28 dni");
            case 3 -> System.out.println("Marzec: 31 dni");
            case 4 -> System.out.println("Kwiecien: 30 dni");
            case 5 -> System.out.println("Maj: 31 dni");
            case 6 -> System.out.println("Czerwiec: 30 dni");
            case 7 -> System.out.println("Lipiec: 31 dni");
            case 8 -> System.out.println("Sierpien: 31 dni");
            case 9 -> System.out.println("Wrzesien: 30 dni");
            case 10 -> System.out.println("Pazdziernik: 31 dni");
            case 11 -> System.out.println("Listopad: 30 dni");
            case 12 -> System.out.println("Grudzien: 31 dni");
            default -> System.out.println("BLAD");
        }
    }
}
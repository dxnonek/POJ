import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        if (skaner.hasNextLine()) {
            System.out.println(Pangram(skaner.nextLine()));
        }
    }

    public static boolean Pangram(String s){
        s = s.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) return false;
        }
        return true;
    }
}

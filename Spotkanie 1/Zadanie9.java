import java.util.Scanner;

public class Zadanie9{
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        char[] tablica = new char[100];
        int licznik = 0;

        if (skaner.hasNext()){
            String slowo = skaner.next();
            for (int i = 0; i < slowo.length() && i < 100; i++){
                tablica[i] = slowo.charAt(i);
                licznik++;
            }
        }
        System.out.println(Palindom(tablica, licznik) ? "TAK" : "NIE");
    }

    public static boolean Palindom(char[] tab, int size){
        for (int i = 0; i < size / 2; i++){
            if (tab[i] != tab[size - 1 - i]) return false;
        }
        return true;
    }
}
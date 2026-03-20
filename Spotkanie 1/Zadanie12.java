import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        try {
            long sec = skaner.nextLong();
            String planet = skaner.next();
            System.out.printf("%.2f\n", lat(sec, planet));
        } catch (Exception e) {
            System.out.println("BLAD");
        }
    }

    public static double lat(long sec, String planet) {
        double z = 31557600.0;
        double ratio = switch (planet.toLowerCase()) {
            case "ziemia" -> 1.0;
            case "merkury" -> 0.2408467;
            case "wenus" -> 0.61519726;
            case "mars" -> 1.8808158;
            case "jowisz" -> 11.862615;
            case "saturn" -> 29.447498;
            case "uran" -> 84.016846;
            case "neptun" -> 164.79132;
            default -> 1.0;
        };
        return sec /  (z * ratio);
    }
}

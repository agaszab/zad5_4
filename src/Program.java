import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int x;
        int y;
        String cwiartka = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj x:");
        x = scan.nextInt();

        System.out.println("Podaj y:");
        y = scan.nextInt();

        if (x > 0 && y > 0) cwiartka = "I";
        if (x > 0 && y < 0) cwiartka = "II";
        if (x < 0 && y < 0) cwiartka = "III";
        if (x < 0 && y > 0) cwiartka = "IV";

        System.out.println("Punkt (" + x + ", " + y + ") leży w " + cwiartka + " ćwiartce układu współrzędnych.");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(Integer.parseInt(""+b.charAt(2)) * Integer.parseInt(a));
        System.out.println(Integer.parseInt(""+b.charAt(1)) * Integer.parseInt(a));
        System.out.println(Integer.parseInt(""+b.charAt(0)) * Integer.parseInt(a));
        System.out.println(Integer.parseInt((a))* Integer.parseInt(b));
    }
}

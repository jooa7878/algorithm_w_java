import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] arr = str.trim().split("\\s+");

        System.out.println(arr[0].isEmpty() ? 0 :  arr.length);
    }
}

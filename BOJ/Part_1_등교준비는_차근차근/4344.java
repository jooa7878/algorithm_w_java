import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TC = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비움

        for(int i=0; i<TC; i++) {
            String temp = scanner.nextLine();
            String[] arr = temp.split("\\s+");
            int sum = 0;
            for (int j=1; j<arr.length; j++){
                sum +=  Integer.parseInt(arr[j]);
            }
            int num = Integer.parseInt(arr[0]);
            double avg = (double) sum / num;
            int cnt = 0;

            for (int j=1; j<arr.length; j++){
                if(Integer.parseInt(arr[j]) > avg) cnt++;
            }
            double ratio = (double) cnt / num * 100;
            System.out.printf("%.3f%%", ratio);  // 비율을 소수점 3자리까지 출력
            System.out.println();
        }
    }
}

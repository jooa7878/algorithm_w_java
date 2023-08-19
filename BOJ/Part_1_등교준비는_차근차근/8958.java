import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TC = scanner.nextInt();

        for(int i=0; i<TC; i++) {
            String temp = scanner.next();
            int answer = 0;
            int score = 0;
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j) == 'X'){
                    score = 0;
                    continue;
                }

                score++;
                answer += score;
            }
            System.out.println(answer);
        }
    }
}

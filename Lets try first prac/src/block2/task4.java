package block2;

import java.util.Scanner;

public class task4 {
    public static long recurtion(int k, int s){
        if (s<0){return 0;}

        if (k==0){return s == 0 ? 1 : 0;}

        long count = 0;

        for (int i = 0; i<=9; i++){
            count += recurtion(k-1, s-i);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int s = scan.nextInt();

        long answer = 0;

        for (int i = 1; i<=9; i++){
            answer += recurtion(k-1, s-i);
        }

        System.out.println(answer);
    }
}

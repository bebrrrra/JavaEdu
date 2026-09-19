package lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 1;
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Invalid arg");
            return;
        }
        else if(n==0){
            System.out.println("Factorial: 0");
            return;
        }
        for (int i=1; i <= n; i++){
            res *= i;
        }
        System.out.println("Factorial: " + res);

    }
}

package block2.lab8;

import java.util.Scanner;

public class task6 {
    public static boolean isPrime(int n, int d) {
        if (d > n / d) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        return isPrime(n, d + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println(isPrime(n, 2) ? "YES" : "NO");
    }
}

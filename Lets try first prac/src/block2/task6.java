package block2;

public class task6 {
    public static int f(int n, int del) {
        if (n % del == 0 && del > 1){
            return 0;
        } else {
            return 1 * f(n, del-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(31, 9));
    }
}

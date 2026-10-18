package block2.lab8;

public class task7 {
    public static void f(int n, int d) {
        if (n == 1){return;}
        if (d > n / d){
            System.out.println(n + " ");
            return;
        }
        if (n % d == 0){
            System.out.println(d + " ");
            f(n/d, d);
        } else{
            f(n, d+1);
        }
    }

    public static void main(String[] args) {
        f(60, 2);
    }

}

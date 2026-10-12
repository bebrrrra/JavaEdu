package block2;

public class task5 {
    public static int f(int n){
        if (n%10==0 && n<10){
            return n;
        }

        return n%10 + f(n/10);
    }

    public static void main(String[] args) {
        System.out.println(f(3277001));
    }
}


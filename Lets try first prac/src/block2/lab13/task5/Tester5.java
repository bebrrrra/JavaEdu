package block2.lab13.task5;

public class Tester5 {
    public static void main(String[] args) {

        PhoneNumber p1 = new PhoneNumber("+79175655655");
        PhoneNumber p2 = new PhoneNumber("89175655655");
        PhoneNumber p3 = new PhoneNumber("+104289652211");

        System.out.println(p1.formatNumber());
        System.out.println(p2.formatNumber());
        System.out.println(p3.formatNumber());
    }
}

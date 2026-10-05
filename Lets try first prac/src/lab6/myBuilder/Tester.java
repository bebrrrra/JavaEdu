package lab6.myBuilder;

public class Tester {
    public static void main(String[] args) {

        MyStringBuilder sb = new MyStringBuilder();

        sb.append("Hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.undo();
        System.out.println("После undo: " + sb);

        sb.undo();
        System.out.println("После undo: " + sb);

        sb.undo();
        System.out.println("После undo: " + sb);
    }
}

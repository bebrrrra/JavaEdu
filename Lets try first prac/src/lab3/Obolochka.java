package lab3;

public class Obolochka {
    public static void main(String[] args) {

        Double d1 = Double.valueOf(5.5);
        Double d2 = Double.valueOf("10.25");

        String strValue = "123.45";
        double parsedDouble = Double.parseDouble(strValue);

        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();
        char c = (char) d1.intValue();
        boolean bool = d1 != 0;

        System.out.println("Значение d1: " + d1);
        System.out.println("Значение d2: " + d2);

        String dStr = Double.toString(3.14);
        System.out.println("Преобразованный литерал: " + dStr);
    }
}


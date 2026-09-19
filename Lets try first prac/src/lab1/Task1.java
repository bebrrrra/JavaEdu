package lab1;

public class Task1 {
    public static void main(String[] args){
        int sum = 0;
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 67, 42};

        for (int i=0; i<10; i++){
            sum += arr[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Ср. значение: " + sum/10);
    }
}

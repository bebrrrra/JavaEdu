package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int min = 100000000;
        int max = 0;
        int sum = 0;

        int i =0;
        do{
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            i++;
        }while (i<10);
        System.out.println("Сумма: " + sum);
        System.out.println("Минимальное: " + min + ", максимальное: " + max);
    }
}

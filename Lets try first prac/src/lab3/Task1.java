package lab3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[10];
        double[] arr2 = new double[10];

        for (int i = 0; i<10; i++){
            arr1[i] = rand.nextInt(100);
            arr2[i] = Math.random();
        }

        System.out.println("First unsorted arr: " + Arrays.toString(arr1));
        System.out.println("Second unsorted arr: " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("First sorted arr: " + Arrays.toString(arr1));
        System.out.println("Second sorted arr: " + Arrays.toString(arr2));
    }
}

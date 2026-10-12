package block1.lab3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        int[] newArr = arr.clone();

        for (int i=0; i<4; i++){
            arr[i] = rand.nextInt(90) + 10;
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(newArr);

        if(Arrays.equals(arr, newArr)){
            System.out.println("Массив является сторого возрастающим");
        }

        System.out.println("Массив не является сторого возрастающим");
    }
}

package assignment1;

import java.util.Scanner;

public class SecondProblem {

    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float[] arr = new float[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        float av = findAVG(arr);
        System.out.println("Time taken " + duration + " milliseconds");
        System.out.println("Avarage number:" + av);
    }
    /*
     *This method returns the average number from an array.
     *Time complexity: 0(n), where n is length of input array.
     *Complexity class: linear
     *@param arr The array of integers where we need to find average of all of them.
     *@return sum/arr.length Sum of all numbers we divide to length of array
     */
    public static float findAVG(float[] arr){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}

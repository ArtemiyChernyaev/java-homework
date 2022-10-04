import java.util.Random;
import java.util.Arrays;

public class Ex_1 {
    public static void showDoubleArr(double arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arrLen = 10;
        double[] arr1 = new double[arrLen];
        double[] arr2 = new double[arrLen];
        Random rand = new Random();

        for(int i = 0; i < arrLen; i++){
            arr1[i] =  rand.nextInt(1000);
            arr2[i] = Math.random();
        }

        showDoubleArr(arr1);
        showDoubleArr(arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        showDoubleArr(arr1);
        showDoubleArr(arr2);
    }
}
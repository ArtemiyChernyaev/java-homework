import java.util.Random;

public class Ex_3 {
    public static void showIntArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[4];
        Random rand = new Random();


        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10,99);
        }

        boolean isIncreaseing = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                isIncreaseing = false;
                break;
            }
        }

        showIntArr(arr);
        System.out.println(isIncreaseing);
    }
}
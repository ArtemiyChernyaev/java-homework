public class Ex_8 {
    public static void main(String[] args) {
        String[] arr = {"1", "2","3","4","5","6","7","8", "9"};

        for(int i = 0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

import java.util.Arrays;

public class InertionSort {
    public static void main(String[] args) {
        int[] arr = {20,14,5,12,6};

        for(int i = 0; i <= arr.length-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }


        }

        System.out.println(Arrays.toString(arr));
    }
    
}

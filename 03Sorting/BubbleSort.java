import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int n = arr.length;
        
        // Best Case
        for(int i = n-1; i >= 1; i--){
            int countSwap =0;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    countSwap =1 ;
                }
                if(countSwap == 0 ) break;
                System.out.println("run");
            }
        }

        // Worst and AVerage Case
        // for(int i = n-1; i >= 1; i--){
        //     for(int j = 0; j <= i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        System.out.println(Arrays.toString(arr));
    }
}

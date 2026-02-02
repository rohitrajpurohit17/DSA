import java.util.Arrays;

public class QuickSort {
    public  static void quickSort(int[] arr,int low , int high){
        if(low < high){
            int partation = parFunction(arr, low, high);
            quickSort(arr, low, partation-1);
            quickSort(arr, partation+1, high);
        }
    }
     public static  void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    public static int parFunction(int[] arr,int low,int high){
        int i = low;
        int j = high;
        int part = arr[low];
        
        while(i<j){
            while( i <= high-1 && arr[i] <= part){
                i++;
            }

            while( j >= low + 1 && arr[j] > part){
                j--;
            }
            if(i < j){
                swap(arr,i,j);
            }
            
        }
         swap(arr,low,j);

       
        
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};

        QuickSort.quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
    
}

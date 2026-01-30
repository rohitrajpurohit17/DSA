import java.util.Arrays;

class Cal {
    public static void mergeSort(int[] arr, int low,int high){
        if(low >= high ) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeArr(arr,low,mid,high);
    }
    private static void mergeArr(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int n = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[n++] = arr[left++];

            }else{
                temp[n++] =  arr[right++];
            }
        }

        while(left <= mid){
            temp[n++] = arr[left++];
        }

        while(right <= high){
            temp[n++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
    arr[i] = temp[i - low];
}
        
        
    }
}
public class MergeSorting {
    public static void main(String[] args) {
       
        int[] arr = {2,5,9,6,1};
        Cal.mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}

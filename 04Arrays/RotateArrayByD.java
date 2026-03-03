import java.util.Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int n = arr.length;

        // d is used to get number of rotation
        int d = 2;

        // it is used if d > n because we can only rotate till the size otherwise gonna get ArrayoutOfIndex
        d = d % n;

        // Left Rotation
        // rev(arr,0,d-1);
        // rev(arr,d,n-1);
        // rev(arr,0,n-1);
        
        // Right Rotation
        rev(arr,0,n-1);
        rev(arr,0,d-1);
        rev(arr,d,n-1);

        System.out.println(Arrays.toString(arr));


    }
    public static void rev(int arr[], int start, int end){
        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}

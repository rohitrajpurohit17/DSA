import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {13,46,20,4};
        for(int i =0; i < arr.length-2; i++){
            int  min = i;
            for(int j = i ; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] =  arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

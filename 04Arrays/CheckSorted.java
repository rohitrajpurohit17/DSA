public class CheckSorted {
    public static void main(String[] args) {
        // int[] arr = { 5,9,5,2,5,3,2};
        int[] arr = { 1,5,6,8,9};

        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i-1] <= arr[i]){

            }else{
                System.out.println("The aray is NOT Sorted");
                return;
            }
        }
        System.out.println("Array is Sorted");
    }
    
}

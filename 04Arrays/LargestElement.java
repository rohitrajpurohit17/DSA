

public class LargestElement {
    public static void largestElement(int[] arr){
        int largest = arr[0];
        for(int i =1; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
    public static void main(String[] args) {
        int[] arr = {9,5,35,2,8,100};
        LargestElement.largestElement(arr);

    }
}

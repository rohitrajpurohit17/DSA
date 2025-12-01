class SwapperArr{
    void funSwap(int arr[], int i, int n){
        if(i >= n) return;

        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;

        funSwap(arr, i+1, n-1);
    }
}
public class O8ArrayEleSwapRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};

        SwapperArr sa = new SwapperArr();
        sa.funSwap(arr, 0, arr.length-1);

        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}

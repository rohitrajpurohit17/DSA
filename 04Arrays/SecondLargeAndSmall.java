public class SecondLargeAndSmall {

    public static void secondLarge(int[] arr) {

        // EDGE CASE 1: Array must have at least 2 elements
        if (arr.length < 2) {
            System.out.println("Second largest element not possible (array size < 2)");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }

        // EDGE CASE 2: All elements are same
        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements are same)");
        } else {
            System.out.println("Second Largest Element = " + secLargest);
        }
    }

    public static void secondSmallest(int[] arr) {

        // EDGE CASE 1: Array must have at least 2 elements
        if (arr.length < 2) {
            System.out.println("Second smallest element not possible (array size < 2)");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] > smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
        }

        // EDGE CASE 2: All elements are same
        if (secSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements are same)");
        } else {
            System.out.println("Second Smallest Element = " + secSmallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5};
        secondLarge(arr);
        secondSmallest(arr);
    }
}

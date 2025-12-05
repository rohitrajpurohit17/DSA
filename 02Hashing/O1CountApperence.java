import java.util.*;

public class O1CountApperence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        for(int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }

        int[] hash = new int[13];

          for(int i =0; i < n; i++){
            hash[arr[i]]++;
        }

        // for(int i = 0; i < hash.length; i++){
        //     System.out.println(hash[i]);
        // }
        System.out.println("How many Number you want to check");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Which Number you want to count: ");
            int num =  sc.nextInt();
            System.out.println(hash[num]);
        }
    }
}

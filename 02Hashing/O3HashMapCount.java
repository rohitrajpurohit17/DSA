
import java.util.HashMap;
import java.util.Scanner;

public class O3HashMapCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] arr = new int[n];

        HashMap<Integer,Integer> mp = new HashMap<>() ;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }

        int q =4;
        while(q-- > 0){
            int num = sc.nextInt();
            System.out.println(mp.getOrDefault(num, 0));
        }
    }
}
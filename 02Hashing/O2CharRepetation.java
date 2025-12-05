// if you are taking just hash[26] then you have take input like ch=a
// ch-'a'; like this so it will as per ASSCI that will be 97-97 = 0
// so our a is on 0 th index of Array 
// 256 contains all charaters 
import java.util.Scanner;

public class O2CharRepetation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "rohitmohit";
        // char[]  ch = str.toCharArray();

        int[] hash = new int[256];
        
        for(int i = 0 ; i < str.length(); i++){
            hash[str.charAt(i)]++  ;
            
        }

        int q = sc.nextInt();
        while(q-- > 0){
            char che = sc.next().charAt(0);

            System.out.println(hash[che]);
        }

       

    }
}

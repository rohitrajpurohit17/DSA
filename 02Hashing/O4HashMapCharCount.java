
import java.util.HashMap;
import java.util.Scanner;

public class O4HashMapCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "rohitmohit";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length()-1;i++){
            mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0)+1);
        }

        int q = 4;
        while(q-- > 0){
            char ch = sc.next().charAt(0);

            System.out.println(mp.getOrDefault(ch, 0));
        }

    }
}

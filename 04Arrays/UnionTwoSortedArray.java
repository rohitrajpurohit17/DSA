import java.util.*;

public class UnionTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,4,5,6};
        int[] b = {1,2,3,3,4,5,6,7};

        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0 ; 
        int j = 0 ;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                if(arr.size() == 0 || arr.get(arr.size()-1) != a[i]){
                    arr.add(a[i]);
                }
                i++;
            }else{
                if(arr.size() == 0 || arr.get(arr.size()-1) != b[j]){
                    arr.add(b[j]);
                }
                j++;
            }
        }

        while(i < a.length){
            if(arr.size() == 0 || arr.get(arr.size()-1) != a[i]){
               arr.add(a[i]); 
            }
            i++;
        }

        while(j < b.length){
            if(arr.size() == 0 || arr.get(arr.size()-1) != b[j]){
                    arr.add(b[j]);
                }
                j++;
        }

        System.out.println(arr);
    }
}

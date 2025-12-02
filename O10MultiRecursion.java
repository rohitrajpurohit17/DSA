class SolutionFibo{
    int fibCal(int n){
        if(n <= 1) return n;

        int last = fibCal(n-1);
        int sLast = fibCal(n-2);;

        return last + sLast;

    }
}
public class O10MultiRecursion {
    public static void main(String[] args) {

        SolutionFibo sf = new SolutionFibo();

        System.out.println(sf.fibCal(4));
        
    }
    
}

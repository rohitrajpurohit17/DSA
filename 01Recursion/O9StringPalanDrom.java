class PlandromCheck{
    boolean palChecker(int  i, String str){
        int n = str.length();
        if(i >= n/2) return  true;
        if(str.charAt(i) !=  str.charAt(n-i-1)) return false;
        return palChecker(i+1, str);
    }
}

public class O9StringPalanDrom {
    public static void main(String[] args) {
        String str = "112211";

        PlandromCheck pl = new PlandromCheck();
        System.out.println(pl.palChecker(0, str));
}
}

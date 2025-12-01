class FactorialAns{
    int fact(int n ){
        if(n == 1) return 1;
        return n * fact(n-1);
    }
}

public class O7FactorialRecursion {
    public static void main(String[] args) {
        FactorialAns fn = new FactorialAns();
        System.out.println(fn.fact(5));
    }
}

class Calcu{
    public void funSum(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        else{
            funSum(n-1,sum+n);
        }
    }
}

public class O5OneToNSum {
    public static void main(String[] args) {
        Calcu c = new Calcu();
        c.funSum(5,0);
    }
}

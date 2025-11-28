 class PrintingNum1{
    // This one is Regular one from the recurssion

    // public void revNum(int n){
    //     if(n == 0){
    //         return;
    //     }else{
    //         System.out.print(n + " ");
    //         n--;
    //         revNum(n);
    //     }
    // }

    // Using Back Tracking Here we have to use another one more fuction for it if we can't use f(n-1)
    public void revNum(int n){
        backTrack(1, n);
    }
    
    public void backTrack(int a,int n){
        if(n < a){
            return;
        }{
            backTrack(a+1, n);
            System.out.print(a + " ");
        }
    }
 }
public class O4Nto1Recursion {
    public static void main(String[] args) {
        PrintingNum1 pr = new PrintingNum1();
        pr.revNum(3);
    }    
}

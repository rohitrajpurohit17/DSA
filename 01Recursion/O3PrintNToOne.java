class RecursionNTo1Print{
    void printingNum(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printingNum(n-1);
    }
}
public class O3PrintNToOne {
   public static void main(String[] args) {
    RecursionNTo1Print nt = new RecursionNTo1Print();
    int n = 4;
    nt.printingNum(n);

   }
}

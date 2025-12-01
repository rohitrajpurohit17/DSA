class FunctionalClass{
    public int funSum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + funSum(n-1);
        }

    }
}
public class O6FuntionalRecursion {
  public static void main(String[] args) {
    FunctionalClass fc = new FunctionalClass();
    System.out.println(fc.funSum(3));
  }  
}

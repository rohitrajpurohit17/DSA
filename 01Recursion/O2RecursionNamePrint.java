class NameRecursion{
    public void namePrint(int i){
        
        if(i == 5){
            return;
        }
        i++;
        System.out.print("Rohit\n");
        namePrint(i);
    }
}
public class O2RecursionNamePrint{
    public static void main(String[] args) {
        NameRecursion nr = new NameRecursion();
        nr.namePrint(1);
    }
}
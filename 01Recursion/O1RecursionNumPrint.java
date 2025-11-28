class RecursionDemo{
    int count = 1;
    public void show(){
        System.out.println(count);

        // if this conditon is not there then it will run infintly
        if(count == 5){
            return;
        }
        count++;

        // Here Function is calling itself in Function
        show();
    }   
}

public class O1RecursionNumPrint {

    public static void main(String[] args) {
        RecursionDemo r = new  RecursionDemo();
        r.show();
    }
}
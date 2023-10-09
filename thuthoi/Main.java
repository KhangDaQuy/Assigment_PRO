import java.util.Scanner;
import java.text.*;
public class Main {

    
    public static void main(String[] args) {
   
       Scanner sc =new Scanner(System.in);
       int x =sc.nextInt();
       
       MyNumber value = new MyNumber();
       value.setValue(x);
       String result = value.displayInfo();
        System.out.println(result);
    }
    
}

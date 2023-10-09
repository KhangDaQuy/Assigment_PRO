import java.util.*;
import java.lang.*;
public class MyNumber {
    int value;
int total;
    public MyNumber() {
        value =0;
    }

    public MyNumber(int k) {
        this.value = k;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyNumber{" + "value=" + value + '}';
    }
    
    public boolean isOdd(){
        if (value %2==0){ return true;}
        else {if (value %2==1) return false;}
        return isOdd();
        
    }
    
    
            
    public boolean IsBeauty(){
        total = 0;
        do {
            total = total + value %10 ;
            value = value / 10;
        } while (value > 0);
        
        if (total %9==0){ return true;}
        else return false;
       
             
    }
    
    public String displayInfo(){
        String result= "Là số chẵn: " + isOdd() + ", Là số đẹp: " + IsBeauty();
        return result;
    }
    
    
}
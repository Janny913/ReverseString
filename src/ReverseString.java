/**
 * Created by jianiyang on 16/7/12.
 */
import java.lang.String;
public class ReverseString {

    //public String reverseString(String s){
       // int length = s.length();
        //if (length <= 1)
           // return s;
        //String strL = s.substring(0,length/2);
        //String strR = s.substring(length/2,length);

        //return reverseString(strR) + reverseString(strL);
   // }
    public String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        String s = new String("4,3,2,1");
        String result = rs.reverseString(s);
        System.out.print(result);
    }
}

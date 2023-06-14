//Java Code to Convert Input Character to ASCII Value
import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character :");
        char c = sc.next().charAt(0);
        int asciival = (int) c;
        System.out.print("The ASCII Value is :" +asciival);
    }
}
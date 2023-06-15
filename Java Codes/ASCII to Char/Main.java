// My OG Code
/*import java.util.*;
public class Main {
    public static void main (String[] args){
        System.out.print("Enter ASCII Value :");
        Scanner sc =  new Scanner(System.in);
        try{
            int ascii = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Please Enter a Valid ASCII value !");
        } finally {
            char c = (char) ascii;
            System.out.print("The Corresponding Character is :"+c);
        }
    }
}*/

// Improvised without loop
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter ASCII Value: ");
        Scanner sc = new Scanner(System.in);
        int ascii;
        try {
            ascii = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Please Enter a Valid ASCII value !");
            return;
        }
        char c = (char) ascii;
        System.out.print("The Corresponding Character is: " + c);
    }
}*/


// Final version of the code

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter ASCII Value: ");

            try {
                int ascii = sc.nextInt();
                char c = (char) ascii;
                System.out.println("The Corresponding Character is: " + c);
                System.out.print("Thank you !");
                break; // Exit the loop after a valid input
            } catch (InputMismatchException e) {
                System.out.println("Please Enter a Valid ASCII value !");
                sc.nextLine(); // Consume the invalid input
            }
        }

        sc.close();
    }
}


package StringClass;

import java.util.Scanner;

public class ClassOfString {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        //use of next(),toLowerCase(),matches() methods.
        System.out.println("Enter Yes or No");
        String s1 = stdin.next();
         s1 = s1.toLowerCase();
        if(s1.matches("yes")) System.out.println("You have chosen to continue the game");
        else if(s1.matches("no")) System.out.println("You have chosen to quit the game");
        else System.out.println("Invalid character");

         //use of concat() method
        String http = "http://";
        String address = "google.com";
        address = http.concat(address);
        System.out.println(address);



    }
}

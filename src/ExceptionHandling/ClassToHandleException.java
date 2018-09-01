package ExceptionHandling;

import java.util.Scanner;



public class ClassToHandleException {
    public static int divisionResult(String s1,String s2){
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        return a1/a2;
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
      System.out.println("Give the numbers to divide.");
        String num1 = stdin.next();
        String num2 = stdin.next();
        try{
            int result = divisionResult(num1,num2);
            System.out.println("Result of division: "+result);

        }catch(NumberFormatException e){
            System.out.println("Both numbers given have to be of type integer");
        }catch (ArithmeticException e){
            System.out.println("Not divisible by zero.");
        }
    }

}

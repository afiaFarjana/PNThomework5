package Loops_Static_example;

import java.util.Scanner;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        int [] array = new int[100];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number for array and to exit enter 0");
        while(true) {
            int input = sc.nextInt();
            if(input == 0) break;
            else
                array[count] = input;
            count++;
        }

        for(int i=0;i<count;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nEnter any number");
      int choice = sc.nextInt();
       int k=1,total =0;
        do{
            if(k%2==0) {
                total +=k;
            }
            k++;
        }while(k<=choice);
        System.out.println("Summation of all even numbers from 2 to "+ choice+" is: "+total);
    }
}

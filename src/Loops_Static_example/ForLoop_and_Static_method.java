package Loops_Static_example;

public class ForLoop_and_Static_method {


  //static method declaration
    public static int[] changeArrayValue(int[] array1, int value){

        for(int i=0;i<array1.length;i++){
            if(array1[i]%7 == 0)
                array1[i] = array1[i] + value;

        }
        return array1;
    }

    public static void main(String[] args) {


          int [] array = new int[5];
        //assign value to array elements.
        for (int i = 0; i < array.length; i++) {

            array[i] = i * 3 - 5;
        }

        ForLoop_and_Static_method f1 = new ForLoop_and_Static_method();

        //print the array elements
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

       int []returnedArray = changeArrayValue(array,8);

       for(int i=0; i<returnedArray.length;i++){
           System.out.print(returnedArray[i] + " ");
       }
        System.out.println("\n");

       //static method changeArrayValue can't be overload.
        int []rArray = changeArrayValue(array,10);

        for(int i=0; i<rArray.length;i++){
            System.out.print(rArray[i] + " ");
        }

        System.out.println("\n");


    }
}

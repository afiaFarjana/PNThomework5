package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ClassArrayList {
    public static void main(String[] args) {
        //starting of array
        int [] array = new int[5];
        for(int i=0;i<5;i++) array[i]= i *3 + 5 ;
        System.out.println("Elements of array: ");
        for(int ele: array) System.out.print(ele+ " ");
        System.out.println("\n");
        //end of array

        //starting of array list
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(34);
        arrayList.add(65);
        arrayList.add(23);
        arrayList.add(76);
        arrayList.add(22);
        System.out.println("Elements of index 1: "+ arrayList.get(1));
        System.out.println("Elements of array list: ");
        int index =0;
        for(Integer ele : arrayList) {

            System.out.println("Index: "+index+" Value: "+ele );
            index++;
        }

        arrayList.remove(3);
        System.out.println("array list after deleting value of index 3: ");
        index =0;
        for(Integer ele : arrayList) {

            System.out.println("Index: "+index+" Value: "+ele );
            index++;
        }

    }
}

package RSFB_API;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;

public class ClassAPI {
    public static void main(String[] args) throws IOException {
        //Scanner class
        System.out.println("Starting of scanner class........");
        int n1 ,n2;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        if(n1>n2) System.out.println("1st number greater than 2nd number");
        else System.out.println("1st number lesser than 2nd number");
        //end

        //Random class
        System.out.println("Starting of random class........");
        Random rd = new Random();
        int num1 = rd.nextInt(1000);
        int num2 = rd.nextInt(500);
        System.out.println("Random variables are: "+num1+" "+num2);


        System.out.println("Starting of filereader & bufferreader class........");
        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/afia/IdeaProjects/youthSports.rtf";
        try{
            fr = new FileReader(path);
        }catch(Exception e){
            System.out.println("File is not found");
        }

        try{
            br= new BufferedReader(fr);
            String data ;
            while((data = br.readLine()) != null ){
                System.out.println(data);
            }

        }catch(Exception e){
            System.out.println("File is not readable");
        }

        finally {
            if(fr != null) fr.close();
            if(br!= null) br.close();

        }
    }
}


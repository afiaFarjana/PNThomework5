package SingleTon;

import java.util.ArrayList;
import java.util.List;

public class SingleTon {
     private int liscence_id;
    private SingleTon(){}
    private static List<SingleTon> objArray = new ArrayList<SingleTon>();
    public static List<SingleTon> getObject(){
        SingleTon obj1 = new SingleTon();
        objArray.add(obj1);
        return objArray;
    }

    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getObject().get(0);
        SingleTon s2 = SingleTon.getObject().get(1);
        SingleTon s3 = SingleTon.getObject().get(2);
        SingleTon s4 = SingleTon.getObject().get(2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


    }
}

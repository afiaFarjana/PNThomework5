package Enumeration;

import java.sql.SQLOutput;

public class OuterClass {
    InnerclassA a = new InnerclassA();
    InnerB b1 = new InnerB();
    public void outerMethodA(){
        System.out.println("Outer A method A");
        a.InnerAMethodB();
    }
     public void outerMethodB(){
        b1.InnerBMethodB();
        System.out.println("Outer A method B");
    }

  public class InnerclassA{
    public void innerAMethodA(){
        System.out.println("Inner A method A");
    }
    private void InnerAMethodB(){
        System.out.println("Inner A method B");
    }
        }
        public class InnerB{
            public void innerBMethodA(){
                System.out.println("Inner B method A");
            }
            public void InnerBMethodB(){
                System.out.println("Inner B method B");
            }
        }
}

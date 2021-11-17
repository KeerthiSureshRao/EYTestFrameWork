package Day9_Abstract_class_part2;

import Day9.ArithmaticInterface;
import Day9.ImplementArithmatic;

public class Driver_Abstarct {
    public static void main(String[] args) {
//creating obj w.r.t class
        ImplementArithmatic Arith_obj1 = new ImplementArithmatic();
        System.out.println(Arith_obj1.addition(20,30));
        System.out.println(Arith_obj1.subtract(30,20));
        System.out.println(Arith_obj1.multiply(2,3));
//creating obj w.r.t interface
        ArithmaticInterface Arith_obj2 = new ImplementArithmatic();
        System.out.println(Arith_obj2.addition(20,30));
        System.out.println(Arith_obj2.subtract(30,20));
        //System.out.println(Arith_obj2.multiply(30,20)); //cannot access since not mentioned on interface class

    }
}

package Day8_Accessmodifierpart2;

import Day8.AccessModifiers;

public class OutsidePackageNormalClass {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.pub);
//      System.out.println(am.pri);   //Outside class, except prvt everything is accessible in same package scenario
//        System.out.println(am.pro);  //inheritance inside package present, then only will work
        //       System.out.println(am.def); //will only work inside package

        am.pubmethod();
    }
}
//            am.primethod();
//        am.promethod();
 //       am.defmethod();


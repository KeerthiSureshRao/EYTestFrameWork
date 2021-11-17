package Day8_Accessmodifierpart2;

import Day8.AccessModifiers;

public class OutsidePackageExtendsClass extends AccessModifiers {
    public static void main(String[] args) {
        OutsidePackageExtendsClass am = new OutsidePackageExtendsClass();
        System.out.println(am.pub);
        //           System.out.println(am.pri);   //Outside class, except prvt everything is accessible in same package scenario
        System.out.println(am.pro);
        //       System.out.println(am.def);

        am.pubmethod();
        //       am.primethod();
        am.promethod();
//        am.defmethod();
    }
}

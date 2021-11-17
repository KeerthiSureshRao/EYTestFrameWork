package Day8;

public class OutsideClassSamePackage {
        public static void main(String[] args) {
            AccessModifiers am=new AccessModifiers();
            System.out.println(am.pub);
//            System.out.println(am.pri);   //Outside class, except prvt everything is accessible in same package scenario
            System.out.println(am.pro);
            System.out.println(am.def);

            am.pubmethod();
//            am.primethod();
            am.promethod();
            am.defmethod();
        }

}

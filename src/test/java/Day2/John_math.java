package Day2;

public class John_math {
    public static void main(String[] args) {
//        int sums = 10 + 20;
//        System.out.println("Sum of Numbers : " + sums);
//
//        int muls = 10 * 20;
//        System.out.println("Multiplication of Numbers : " + muls);
//
//        int subs = 20 - 10;
//        System.out.println("Subtraction of Numbers : " + subs);
        Common_arithmatics arithmatics = new Common_arithmatics();
        int ADD = arithmatics.add(10,20);
        System.out.println("Sum of Two Numbers : " + ADD);
        int SUB = arithmatics.sub(20,10);
        System.out.println("Subtraction of Two Numbers : " + SUB);
        int MULS = arithmatics.mul(20,10);
        System.out.println("Multiplication of Two Numbers : " + MULS);

    }
}

package Day7;

public class TestCode {
    public static void main(String[] args) {
        Jim jimobj = new Jim();
        System.out.println("Sum of Two Numbers : " + jimobj.addNum(10,20));
        System.out.println("Subtract of Two Numbers : " + jimobj.subNum(20, 10));
        System.out.println("Division of Two Numbers : " + jimobj.divNum(20,10));

        John johnobj = new John();
        System.out.println("Sum of Two Numbers : " + johnobj.addNum(10,20));
        System.out.println("Subtract of Two Numbers : " + johnobj.subNum(20, 10));
        System.out.println("Power Numbers : " + johnobj.powerofNumber(2,3));
    }
    }


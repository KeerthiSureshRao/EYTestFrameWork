package Day2;

public class Understand_variables {
    public static void main(String[] args) {
        Common_arithmatics ca=new Common_arithmatics();
        ca.increment();
        System.out.println("value of j : " +ca.j);
        System.out.println("value of k : " + Common_arithmatics.k);
        System.out.println ("--------------------------");
        Common_arithmatics cal=new Common_arithmatics();
        cal.increment();
        System.out.println("value of j : " +ca.j);
        System.out.println("value of k : " + Common_arithmatics.k);
Common_arithmatics.addk();
    }
}

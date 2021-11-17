package Day12_13;

public class Driver_LearnConstructor {
    public static void main(String[] args) {
        LearnConstructor lconst_obj = new LearnConstructor(); //LearnConstructor is a method [Note:Name same as classname], hence called constructor.
 //       lconst_obj.setVal(10,30); //setVal is a method
        lconst_obj.sum();
        System.out.println("Constructor #1 w/o parameters : Sum is : "+lconst_obj.sum()); //sum is a method

        LearnConstructor lconst_obj2 = new LearnConstructor(10, 50);
        System.out.println("Constructor #2 with parameters a & b : Sum is : " + lconst_obj2.sum());
    }}

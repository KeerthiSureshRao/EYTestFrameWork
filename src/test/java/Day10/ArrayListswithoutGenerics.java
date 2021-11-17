package Day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListswithoutGenerics {
    public static void main(String[] args) {
        List al = new ArrayList(); //Generics not used, so anything input is acceptable i.e, list become heterogeneous
        al.add("1");
        al.add("2");
        al.add("3");
        al.add(100);
        Iterator<String> iter = al.iterator();//To read value from a collection, better to use Iterator than Forloop [due to perf reasons]
        while(iter.hasNext())//iter.hasNext()-picks value'1'&check continues till next value present,so after '7' no next value so condition violets won't go in to loop.So goes outside while loop.
            {
            String Digits = iter.next();
            System.out.println("Digit is : " + Digits);
        } System.out.println("Digit on Index 0 is : " + al.get(0)); }} //To call value on particular index scenario


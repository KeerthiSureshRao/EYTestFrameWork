package Day10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListswithGenerics {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();//'<>' called generics :Only store mentioned type of values, so other types won't be accepted
        al.add("Keerthi");
        al.add("Geethu");
        al.add("Keerthi");
        al.add("Kavitha");
        al.add(2, "Krishna"); //Adding element in btwn
//      al.add(123); //since not a string(mentioned as generics-'String' type on top) showing ERROR
        Iterator<String> iter = al.iterator();//To read value from a collection, better to use Iterator than Forloop [due to perf reasons]
        while(iter.hasNext()){//iter.hasNext()-picks value'1'&check continues till next value present,so after '7' no next value so condition violets won't go in to loop.So goes outside while loop.
            String Digits = iter.next();
            System.out.println("Digit is : " + Digits);
        } System.out.println(al.contains("Geethu"));
        System.out.println("Digit on Index 0 is : " + al.get(0)); }} //To call value on particular index scenario


package Day10;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;
public class TreeSets {
    public static void main(String[] args) {
        Set<String> al = new TreeSet<String>(); //
        al.add("Keerthi");
        al.add("Megha");
        al.add("Keerthi"); //Since duplicate, only one will be displayed in O/P
        al.add("Geethu");
        al.add("Megha");
        al.add("Amala");
        Iterator<String> iter = al.iterator();//To read value from a collection, better to use Iterator than Forloop [due to perf reasons]
        while(iter.hasNext())//iter.hasNext()-picks value'1'&check continues till next value present,so after '7' no next value so condition violets won't go in to loop.So goes outside while loop.
            {
            String Digits = iter.next();
            System.out.println("Name is : " + Digits);}}}
 //       } System.out.println("Digit on Index 0 is : " + al.get(0)); }} //won't work


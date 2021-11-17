package Day10;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class LinkedLists {
    public static void main(String[] args) {
        List<String> al = new LinkedList<String>(); //List<String> is an Interface which ensures same method is reusable across multiple classes who are implementing same interface
        al.add("Keerthi");
        al.add("Megha");
        al.add("Geethu");
        al.add("Keerthi");
//      al.add(123); //since not a string(mentioned as generics-'String' type on top) showing ERROR
        Iterator<String> iter = al.iterator();//To read value from a collection, better to use Iterator than Forloop [due to perf reasons]
        while(iter.hasNext())//iter.hasNext()-picks value'1'&check continues till next value present,so after '7' no next value so condition violets won't go in to loop.So goes outside while loop.
            {
            String Digits = iter.next();
            System.out.println("Name is : " + Digits);
        } System.out.println("Name on Index 0 is : " + al.get(0)); }} //To call value on particular index scenario


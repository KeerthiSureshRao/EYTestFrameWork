package Day11;
import java.util.HashMap; import java.util.Iterator; import java.util.Map;
public class HashMaps { public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();//<Key,Value> : <String, String> Eg:Country,India or <String,Integer> Eg: Age,16
        hmap.put("Teacher","Sheethal");
        hmap.put("Sister","Geethu");
        hmap.put("Friend","Kavitha");
        hmap.put("Friend","Megha");
        hmap.put("Friend","Geethu");
        hmap.put("Classmate","Geethu");
        System.out.println(hmap.get("Sister"));//To get value for particular key scenarioEg:Sister is key&need to know value in it.
//  To traverse, need to iterate (requires 'iterator' but having two column value for hmap-
        Iterator<String> iter = hmap.keySet().iterator();
        while (iter.hasNext()){
            String key=iter.next();
            String value =hmap.get(key);
            System.out.println("Key is :" +" " + key + " and Value is :" + " " + value ); }}}

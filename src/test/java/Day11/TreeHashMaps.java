package Day11;
import java.util.Iterator; import java.util.TreeMap; import java.util.Map;
public class TreeHashMaps { public static void main(String[] args) {
        Map<String, String> tmap = new TreeMap<>();//<Key,Value> : <String, String> Eg:Country,India or <String,Integer> Eg: Age,16
        tmap.put("Teacher","Sheethal");
        tmap.put("Sister","Geethu");
        tmap.put("Friend","Kavitha");
        tmap.put("Friend","Megha");
        tmap.put("Friend","Geethu");
        tmap.put("Classmate","Geethu");
        System.out.println(tmap.get("Sister"));//To get value for particular key scenarioEg:Sister is key&need to know value in it.
//  To traverse, need to iterate (requires 'iterator' but having two column value for hmap-
        Iterator<String> iter = tmap.keySet().iterator();
        while (iter.hasNext()){
            String key=iter.next();
            String value =tmap.get(key);
            System.out.println("Key is :" +" " + key + " and Value is :" + " " + value ); }}}

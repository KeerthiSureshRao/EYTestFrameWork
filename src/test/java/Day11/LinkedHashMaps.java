package Day11;
import java.util.HashMap; import java.util.Iterator; import java.util.LinkedHashMap; import java.util.Map;
public class LinkedHashMaps { public static void main(String[] args) {
        Map<String, String> lhmap = new LinkedHashMap<>();//<Key,Value> : <String, String> Eg:Country,India or <String,Integer> Eg: Age,16
        lhmap.put("Teacher","Sheethal");
        lhmap.put("Sister","Geethu");
        lhmap.put("Friend","Kavitha");
        lhmap.put("Friend","Megha");
        lhmap.put("Friend","Geethu");
        lhmap.put("Classmate","Geethu");
        System.out.println(lhmap.get("Sister"));//To get value for particular key scenarioEg:Sister is key&need to know value in it.
//  To traverse, need to iterate (requires 'iterator' but having two column value for hmap-
        Iterator<String> iter = lhmap.keySet().iterator();
        while (iter.hasNext()){
            String key=iter.next();
            String value =lhmap.get(key);
            System.out.println("Key is :" +" " + key + " and Value is :" + " " + value ); }}}

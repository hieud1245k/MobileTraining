import java.util.Map;
import java.util.HashMap;
public class Mymap{
    public static void main( String args[]){
        Map<String, String> mapvalue = new HashMap<String, String>();
        mapvalue.put("s","c");
        mapvalue.put("d","m");
        mapvalue.put("h","x");
        for(Map.Entry me :mapvalue.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
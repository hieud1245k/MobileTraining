import java.util.*;

public class nhapkt { 
public static void main(String[] args){
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
    }

}
}
import java.util.List;
import java.util.ArrayList;
public class List1{
    public static void main(String args[]){
        List<String> myList = new ArrayList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        for(String superhero :myList)
        System.out.println(superhero);
    }
    
}
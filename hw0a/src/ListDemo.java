import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListDemo {
    public static void main(String[] args){
        Map<String,String> L = new TreeMap<String,String>();
        L.put("dog","woof");
        L.put("cat","meow");
        String sound = L.get("cat");
    }
}

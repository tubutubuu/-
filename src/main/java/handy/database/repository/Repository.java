package handy.database.repository;
import java.util.LinkedHashMap;
import java.util.Map;
public class Repository {
    public static java.util.Map<String,String> method(){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        return map;
    }
}

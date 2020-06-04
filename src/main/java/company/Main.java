package company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HashMap<Object, Object> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        Set<Map.Entry<Object, Object>> entrySet = map.entrySet();
        for(Map.Entry<Object, Object> o :entrySet ){
            System.out.println(o.getKey()+"===" +o.getValue());

        }
    }
}

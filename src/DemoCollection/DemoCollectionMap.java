package DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        Map<Integer, Double> map2 = new HashMap<>();
        // khong lưu đươợc key trùng nhau
        map1.put("language", "Java");
        map1.put("framework", "TestNG");

        map2.put(6 , 9.0);

        System.out.println("Map 1: " + map1);
        System.out.println("Map2: " + map2);

        // duyet Map
        // get het gia tri cua  key và value
        for(Map.Entry<String, String> entry : map1.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

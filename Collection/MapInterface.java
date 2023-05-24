package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapInterface {
    public static void main(String[] args) {
        
        // create map object 
        // Map<Integer, String> map = new HashMap<>();
        var map = setMap(new HashMap<>()); // mutable
        map.put(11, "20");
        System.out.println(map);
        // Map factory methods 
        map = Map.of(12, "12");
        System.out.println(map);

        // change mutable to immutable
        map = Map.copyOf(map);
        // map.put(20, "20");
        // System.out.println(map);
        map = Map.of(12, "12", 13, "13");
        // System.out.println(map);

        setMap(new TreeMap<>());
        setMap(new LinkedHashMap<>());

        // Map methods
        Map<String, String> mapMethod = new HashMap<>();
        // insert data
        mapMethod.put("name", "Mg Mg");
        System.out.println("put : " + mapMethod); // {name=Mg Mg} => if already have key, insert latest data
        System.out.println("get : " + mapMethod.get("name")); // Mg Mg
        System.out.println("put if absent : " + mapMethod.putIfAbsent("age", "20")); // {name=Mg Mg, age=20}
        System.out.println(mapMethod.replace("name", "kyaw kyaw")); // return old value => Mg Mg
        System.out.println(mapMethod);
        System.out.println(mapMethod.replace("data", "kyaw kyaw")); // return null, if not have key, cannot insert anymore
        System.out.println(mapMethod);
        System.out.println("remove : " + mapMethod.remove("name")); // Mg Mg
        System.out.println("remove : " + mapMethod.remove("name", "Mg Mg")); // true

        System.out.println(mapMethod.isEmpty()); // return true/false
        System.out.println(mapMethod.size()); // 1
        System.out.println(mapMethod.keySet() + " = " + mapMethod.values()); // [age] = [20]
        System.out.println(mapMethod.entrySet()); // return key value pair => [age=20]
        Map<String, String> mapMethod2 = new HashMap<String, String>();
        mapMethod2 = Map.of("age" , "20");
        System.out.println(mapMethod.equals(mapMethod2)); // compare two map objects => true
        System.out.println(mapMethod.containsKey("age")); // true
        System.out.println(mapMethod.containsValue("20")); // true
        mapMethod.clear(); // remove all mappingss
        System.out.println(mapMethod); // {}

        // Map Compute Methods
        System.out.println("Map Compute Methods");
        Map<Integer, Integer> mapComputeMethod = new HashMap<>();
        mapComputeMethod.put(1, 100);
        mapComputeMethod.put(2, 200);
        System.out.println(mapComputeMethod); // {1=100, 2=200}
        mapComputeMethod.compute(2, new BiFunction<>() {
            public Integer apply(Integer key, Integer val) {
                return val * 2;
            }
        }); // if not have key, out NullPointerException error

        System.out.println(mapComputeMethod); // {1=100, 2=400}

        // use anonymous class to lambda
        System.out.println(mapComputeMethod.computeIfPresent(2, (k, v) -> v*2)); //{1=100, 2=800}/ if not have key, return null
        System.out.println(mapComputeMethod); // {1=100, 2=800}
    
        System.out.println(mapComputeMethod.computeIfAbsent(3, (k) -> k*300)); //{1=100, 2=400, 3=900}/ if have key, not changes, get original val
        System.out.println(mapComputeMethod);
    }

    static Map<Integer, String> setMap(Map<Integer, String> map) {
        for (Integer i = 10; i > 0; i--) {
            map.put(i, i.toString());
        }
        return map;
    }
}

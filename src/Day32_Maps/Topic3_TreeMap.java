package Day32_Maps;

import java.util.TreeMap;

public class Topic3_TreeMap {
    public static void main(String[] args) {
        //DataType VariableName = new DataType();
        TreeMap <String, Integer> ModelYearOfCars = new TreeMap<>();

        ModelYearOfCars.put("Tesla", 2021);
        ModelYearOfCars.put("Mercedes", 2020);
        ModelYearOfCars.put("Subaru", 2009);

        System.out.println(ModelYearOfCars);
        System.out.println(ModelYearOfCars.keySet());

        System.out.println("+++++++++++++++++++++++");

        for (String MyKey:ModelYearOfCars.keySet()) {
            System.out.println("Key: "+MyKey);

            //get(Key) - returns the value associated with the specified key.
            System.out.println("Value: "+ModelYearOfCars.get(MyKey));
        }

        System.out.println("++++++++++++++++++++++++");
        System.out.println(ModelYearOfCars.get("Bmw"));
        System.out.println(ModelYearOfCars.getOrDefault("Bmw", -1));

        int Year  =ModelYearOfCars.getOrDefault("Bmw", -1);

        // put(Key, Value) - Inserts the association of a key and a value into the map.
        // If the key is already present, the new value replaces the old value.
        ModelYearOfCars.put("Tesla", 2022);

    }
}

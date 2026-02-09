import java.util.*;

public class Hashings  {
    public static void main(String[] args) {

        //country (key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();


        //insertion
        map.put("India",120);
        map.put("Us",30);
        map.put("China",150);

        System.out.println(map);

       map.put("China", 180);
       System.out.println(map);

       //search
       if(map.containsKey("Indonesia")){
        System.err.println("Key is present in the map");
       } else {
        System.out.println("Key is not present in the map");
       }
      System.out.println(map.get("China"));
      System.out.println(map.get("Indonesiia"));

    int arr[] = {12, 15, 18};
    for(int i=0; i<3; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    for(int val : arr){
        System.out.print(val + " ");
    }
    System.out.println();

    //for( int val : arr);
    for(Map.Entry<String , Integer> e : map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());

    }

    //second way
    Set<String> Keys = map.keySet();

    for(String Key : Keys){
        System.out.println(Key+ " "+ map.get(Key));
    }

    map.remove("China");
    System.out.println(map);
}
}

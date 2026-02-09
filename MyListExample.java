import java.util.ArrayList;
 import java.util.Collections;

public class MyListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //  ArrayList<String> list2 = new ArrayList<String>();
        //   ArrayList<Boolean> list3 = new ArrayList<Boolean>();
          //add element
          list.add(0);
          list.add(3);
          list.add(4);
          list.add(5);
          System.out.println(list);

         //to get an element 
          int element = list.get(0); // 0 is index
          System.out.println(element);

          //add element  in b/w
          list.add(3,2); //1 is  index and 2 is elemnt to be added
          System.out.println(list);
          //set element
          list.set(0,5);
          System.out.println(list);
            //delete elements
           list.remove(1);
           System.out.println(list);

           //size of list 
           int size = list.size();
           System.out.println(size);

           //loop
           for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
           }
           System.out.println();

           //sorting
           Collections.sort(list);
           System.out.println(list);
     }
    
}

package collection;

import java.util.*;

public class Main {

    public static void main(String... args) {
        List<String> myList = new ArrayList();
        myList.add("pierwszy");
        myList.add("drugi");
        myList.addAll(Arrays.asList("trzeci", "czwarty"));

        //forMethodsSout(myList);
        //String[] objects = (String[]) myList.toArray();
        ////////////////////////////////////////////////////
        Map<String, Double> map = new HashMap<>();
        map.put("alpha",1.23);
        map.put("beta", 2.1);
        map.put("final",5.2);



    }

    private static void forMethodsSout(List<String> myList) {
        myList.forEach(System.out::println);

        myList.forEach(element -> System.out.println(element));

        for(String element : myList) {
            System.out.println(element);
        }

        for(int i =0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}

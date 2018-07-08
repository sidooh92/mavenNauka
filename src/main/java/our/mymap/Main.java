package our.mymap;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Main {
    public static void main(String[] args) {
      Map<String,Integer> map = new HashMap<>();
      //string to key, interger to value
        map.put("Maj",asciValueOfMonth("Maj"));
        //wypelnij tablice miesiacami nadaja im wartosc
        // bedaca suma ich liter w ascii

        //nastpenie wyswietl zawartosc mapy uzywajac iteratora
        //wykorzystac entrySet i iterator hasNext



    }

}

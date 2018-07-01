package our.mylist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("TEST");

        MyList myList = new MyListImpl();
        myList.add("poniedzialek");
        myList.add("wtorek");
        myList.add("sroda");
        myList.add("czwartek");
        myList.add("piatek");

        logger.info(myList.returnListAsString());
        logger.info("sisze of list {} {}",
                myList.getSize(), myList.getSize());

        //chcemy utworzyc wlasna liste
        //1. dodac do niej wartosci kolejno dni tygodnia
        //2. wyswietlenie wszystkich elementow listy
        //3. zwrocenie rozmiaru listy
        //4. usuniecie elementu z listy


    }


}

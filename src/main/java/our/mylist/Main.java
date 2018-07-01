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
        logger.info("sisze of list {}",  myList.getSize());

        myList.remove("piatek");
        myList.add("sobota");

        logger.info(myList.returnListAsString());
        logger.info("sisze of list {}",  myList.getSize());
    }


}

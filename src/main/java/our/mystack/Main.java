package our.mystack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import our.mylist.MyList;
import our.mylist.MyListImpl;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("BEGIN");
        MyStackElem jan = new MyStackElem("January");
        MyStackElem feb = new MyStackElem("February");
        MyStackElem mar = new MyStackElem("March");

        MyStack myStack = new MyStackImpl();
        myStack.push(jan);
        myStack.push(feb);
        myStack.push(mar);

        logger.info("END");
    }


}

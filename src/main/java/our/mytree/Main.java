package our.mytree;

import lombok.extern.slf4j.Slf4j;
import lombok.val;


@Slf4j
public class Main {



    public static void main(String... args) {
        log.info("Start.");
        //Implementation of binary tree

        MyTree myTree = new MyTreeImpl();
        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(3);
        myTree.insert(4);
        myTree.insert(5);
        myTree.insert(6);
        myTree.insert(7);
        myTree.insert(8);
//
//        myTree.search(5);
//        myTree.min();
//        myTree.max();
//
//        myTree.remove(3);
//        myTree.showInOrder();
//        myTree.showPreOrder();
//        myTree.showPostOrder();



    }

}

package our.mytree;

import lombok.extern.slf4j.Slf4j;
import lombok.val;


@Slf4j
public class Main {

    public static int silnia(int i) {
        if( i < 1)
            return 1;
        return i * silnia(i - 1);
    }

    public static void main(String... args) throws Exception {
        log.info("Start.");
        //Implementation of binary tree
        log.info("SUMOWANIE {}",silnia(3) );




        MyTree myTree = new MyTreeImpl();
        myTree.insert(8);
        myTree.insert(3);
        myTree.insert(10);
        myTree.insert(1);
        myTree.insert(6);
        myTree.insert(14);
        myTree.insert(4);
        myTree.insert(7);
        myTree.insert(13);
//////
//      myTree.showInOrder(((MyTreeImpl) myTree).root);
////        myTree.min();
////        myTree.max();
////
//        myTree.remove(3);
//        myTree.showInOrder(((MyTreeImpl) myTree).root);
        myTree.showPreOrder(((MyTreeImpl) myTree).root);
//        myTree.showPostOrder();



    }

}

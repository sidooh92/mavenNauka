package our.mytree;

import lombok.extern.slf4j.Slf4j;


public interface MyTree {

    void insert(int i);
    void search(int i);
    void min();
    void max();
    void remove(int i);
    void showInOrder();
    void showPreOrder();
    void showPostOrder();
}

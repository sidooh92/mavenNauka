package our.mytree;


public interface MyTree {

    void insert(int i);
    Node search(int i);
    void min();
    void max();
    void remove(int i);
    void showInOrder(Node node);
    void showPreOrder(Node node);
    void showPostOrder(Node node);
}

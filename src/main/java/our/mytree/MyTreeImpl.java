package our.mytree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTreeImpl implements MyTree {

    private Node root = null;

    @Override
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node temp = root;
            Node parent = null;
            while (temp != null) {
                parent = temp;
                if (temp.getKey() > key) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (parent.getKey() > key) {
                parent.setLeft(new Node(key));
                parent.getLeft().setParent(parent);
            } else {
                parent.setRight(new Node(key));
                parent.getRight().setParent(parent);
            }


        }
    }

    @Override
    public Node search(int key) {
        Node temp = root;
        while(temp !=  null && temp.getKey()!= key) {
        temp = temp.getKey() > key ?
                temp.getLeft() : temp.getRight();
        }
        return temp;
    }

    @Override
    public void min() {
        Node minNode = root;
        while (minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }
        log.info("MIN: {}", minNode.getKey());
    }

    @Override
    public void max() {
        Node maxNode = root;
        while (maxNode.getRight() != null) {
            maxNode = maxNode.getRight();
        }
        log.info("MAX: {}", maxNode.getKey());
    }

    @Override
    public void remove(int i) {












        
    }

    @Override
    public void showInOrder(Node node)
    {
    }

    @Override
    public void showPreOrder(Node node)  {

    }

    @Override
    public void showPostOrder(Node node)  {

    }
}

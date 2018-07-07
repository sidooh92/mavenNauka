package our.mytree;

public class MyTreeImpl implements MyTree {

    private Node root = null;

    @Override
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node actual = root;
            Node parent = null;
            while (actual != null) {
                parent = actual;
                if (actual.getKey() > key) {
                    actual = actual.getLeft();
                } else {
                    actual = actual.getRight();
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
    public void search(int i) {

    }

    @Override
    public void min() {

    }

    @Override
    public void max() {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void showInOrder() {

    }

    @Override
    public void showPreOrder() {

    }

    @Override
    public void showPostOrder() {

    }
}

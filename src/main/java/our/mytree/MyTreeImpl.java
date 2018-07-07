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
        while (temp != null && temp.getKey() != key) {
            temp = temp.getKey() > key ?
                    temp.getLeft() : temp.getRight();
        }
        return temp;
    }

    @Override
    public Node min() {
        Node minNode = root;
        while (minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }
        log.info("MIN: {}", minNode.getKey());
        return minNode;
    }

    @Override
    public Node max() {
        Node maxNode = root;
        while (maxNode.getRight() != null) {
            maxNode = maxNode.getRight();
        }
        log.info("MAX: {}", maxNode.getKey());
        return maxNode;
    }

    @Override
    public Node remove(int key) throws Exception {
        Node nodeToRemove = this.search(key);
        Node parentOfNodeToRemove = nodeToRemove.getParent();
        Node temp;
        if (nodeToRemove.getLeft() != null &&
                nodeToRemove.getRight() != null) {
                temp = this.remove(this.sucessor(key).key);

        } else
            temp = nodeToRemove.getLeft() != null ?
                    nodeToRemove.getLeft() : nodeToRemove.getRight();
        if (temp != null) {
            temp.setParent(parentOfNodeToRemove);
        }
        if (parentOfNodeToRemove == null) {
            root = temp;
        } else if (parentOfNodeToRemove.getLeft() == nodeToRemove) {
            parentOfNodeToRemove.setLeft(temp);
        } else {
            parentOfNodeToRemove.setRight(temp);
        }
        return nodeToRemove;
    }

    private Node sucessor(int key) throws Exception {
        Node node = this.search(key);

        if(node.getLeft() != null) {
            node = node.getLeft();
            while(node.right != null) {
                node = node.right;
            }
            return node;
        } else if(node.getLeft() == null && node !=
                this.root && node != this.min()) {
            Node parent = node.getParent();
            while (parent != root && parent.getKey() > node.getKey()) {
                parent = parent.getParent();
            }
            return parent;
        }
            else throw new Exception("NIE MA");
        }


    @Override
    public void showInOrder(Node node) {
    }

    @Override
    public void showPreOrder(Node node) {

    }

    @Override
    public void showPostOrder(Node node) {

    }
}

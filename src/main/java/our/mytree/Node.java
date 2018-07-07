package our.mytree;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    int key;
    Node left;
    Node right;
    Node parent;

    public Node(int key) {
        this.key = key;
    }
}

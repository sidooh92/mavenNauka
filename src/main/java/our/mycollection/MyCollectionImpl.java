package our.mycollection;


public class MyCollectionImpl implements MyCollection {


    private MyNode firstElement;
    private MyNode lastElement;
    private int size = 0;

    @Override
    public void enqueue(MyNode myNode) {
        if (this.firstElement == null) {
            this.firstElement = myNode;
            this.lastElement = myNode;
        } else {
            myNode.setNextElemnt(this.lastElement);
            this.lastElement = myNode;
        }
    }

    @Override
    public MyNode dequeue() {


        //2 PODEJSCIA


        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String returnCollectionAsString() {
        return null;
    }
}

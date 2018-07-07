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
        size++;
    }

    @Override
    public MyNode dequeue() {
        MyNode temporary = this.lastElement;
        while (temporary.getNextElemnt() != firstElement) {
            temporary = temporary.getNextElemnt();
        }
        MyNode tempResult = firstElement;
        tempResult.setNextElemnt(null);
        firstElement = temporary;
        size--;
        return tempResult;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String returnCollectionAsString() {
        String wynik = "";
        MyNode temporary = this.lastElement;
        while (temporary != null) {
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElemnt();
        }
        return wynik;
    }
}

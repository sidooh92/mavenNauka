package our.mycollection;


public class MyCollectionImpl implements MyCollection {


    private MyNode firstElement;
    private MyNode lastElement;
    private int size = 0;

    @Override
    public void enqueue(MyNode myNode) {
        //TODO: JEZELI KOLEJKA JEST PUSTA TO
        // FIRST I LAST WSKAZUJA
        // NA TEN SAM NOWT ELEMENT

        //TODO: WIECEJ ELEMENTOW
        //PIERWSZY ZOSTAJE BEZ ZMIAN, DRUGI JEST OSTATNIM


    }

    @Override
    public MyNode dequeue() {
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

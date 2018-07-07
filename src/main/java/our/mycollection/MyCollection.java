package our.mycollection;

public interface MyCollection {

    void enqueue(MyNode myElement);
    MyNode dequeue();

    int getSize();
    String returnCollectionAsString();
}



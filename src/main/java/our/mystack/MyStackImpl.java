package our.mystack;

public class MyStackImpl implements MyStack {

    private int size = 0;

    MyStackElem first;

    @Override
    public void push(MyStackElem stackElem) {
        size++;
        stackElem.setNext(first);
        this.first = stackElem;
    }

    @Override
    public MyStack pop() {
        size--;
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getAllElementOfStack() {
        return null;
    }
}

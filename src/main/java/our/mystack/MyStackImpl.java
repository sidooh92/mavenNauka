package our.mystack;

public class MyStackImpl implements MyStack {

    private int size = 0;
    MyStackElem first;

    @Override
    public void push(MyStackElem stackElem) {
        this.size++;
        stackElem.setNext(first);
        this.first = stackElem;
    }

    @Override
    public MyStackElem pop() {
        this.size--;
        if (!isEmpty()) {
            MyStackElem temporary = this.first;
            this.first = this.first.getNext();
            return temporary;
        }
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String getAllElementOfStack() {


        return null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}

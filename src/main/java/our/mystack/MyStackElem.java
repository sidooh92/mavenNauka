package our.mystack;

public class MyStackElem<T> {
    private T content;
    private MyStackElem next;

    public MyStackElem(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public MyStackElem getNext() {
        return next;
    }

    public void setNext(MyStackElem next) {
        this.next = next;
    }
}

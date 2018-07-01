package our.mystack;

public class MyStackElem {
    private String content;
    private MyStackElem next;

    public MyStackElem(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MyStackElem getNext() {
        return next;
    }

    public void setNext(MyStackElem next) {
        this.next = next;
    }
}

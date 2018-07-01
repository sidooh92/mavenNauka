package our.mystack;

public interface MyStack {

    public void  push(MyStackElem myStack);
    public MyStackElem pop();
    public int size();
    public String getAllElementOfStack();
    public boolean isEmpty();
}

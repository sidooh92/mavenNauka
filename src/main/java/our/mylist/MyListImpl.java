package our.mylist;

public class MyListImpl implements MyList{

    private MyElement firstElement;
    private MyElement lastElement;

    public MyListImpl() {
        this.firstElement = null;
    }

    @Override
    public void add(String myElementString) {
        MyElement myElementToAdd =
                new MyElement(myElementString);

        if(listIsEmpty()) {
            this.firstElement = myElementToAdd;
            this.lastElement = myElementToAdd;
        }
        else {
            MyElement temporaryElement = this.lastElement;
            temporaryElement.setNextElemnt(myElementToAdd);
            this.lastElement = myElementToAdd;

              }
    }
    private boolean listIsEmpty() {
        return this.firstElement == null;

    }
}

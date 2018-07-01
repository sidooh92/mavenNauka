package our.mylist;

public class MyListImpl implements MyList{

    private MyElement firstElement;
    private MyElement lastElement;

    public MyListImpl(MyElement firstElement) {
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


        }



    }
}

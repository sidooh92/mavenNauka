package our.mylist;

public class MyListImpl implements MyList {

    private MyElement firstElement;
    private MyElement lastElement;

    public MyListImpl() {
        this.firstElement = null;
    }

    @Override
    public void add(String myElementString) {
        MyElement myElementToAdd =
                new MyElement(myElementString);

        if (listIsEmpty()) {
            this.firstElement = myElementToAdd;
            this.lastElement = myElementToAdd;
        } else {
            MyElement temporaryElement = this.lastElement;
            temporaryElement.setNextElemnt(myElementToAdd);
            this.lastElement = myElementToAdd;
        }
    }

    public String returnListAsString() {
        String wynik = "";
        MyElement temporary = this.firstElement;
        while(temporary != null) {
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElemnt();
        }
        return wynik;
        ///String ktory ma wartosc  poniedzialek, wtorek, sroda
    }

    @Override
    public int getSize() {
        return 0;
    }


    private boolean listIsEmpty() {
        return this.firstElement == null;

    }
}

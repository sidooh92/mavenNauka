package our.mylist;

public class MyListImpl implements MyList {

    private MyElement firstElement;
    private MyElement lastElement;
    private int size = 0;

    public MyListImpl() {
        this.firstElement = null;
    }

    @Override
    public void add(String myElementString) {
        size++;
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
        while (temporary != null) {
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElemnt();
        }
        return wynik;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void remove(String element) {
        if (this.firstElement.getMyString().equals(element)) {
            this.firstElement = this.firstElement.getNextElemnt();
        } else {
            MyElement temporaryPrev = firstElement;
            MyElement temporaryCurrent = firstElement.getNextElemnt();
            MyElement temporaryNext = temporaryCurrent.getNextElemnt();

            while (!temporaryCurrent.getMyString().equals(element)) {
                temporaryPrev = temporaryCurrent;
                temporaryCurrent = temporaryCurrent.getNextElemnt();
                temporaryNext = temporaryCurrent.getNextElemnt();
            }
            if(temporaryCurrent.getMyString().equals
                    (lastElement.getMyString())) {
                this.lastElement = temporaryPrev;
            }

            temporaryPrev.setNextElemnt(temporaryNext);

            size--;
        }


    }


    private boolean listIsEmpty() {
        return this.firstElement == null;

    }
}

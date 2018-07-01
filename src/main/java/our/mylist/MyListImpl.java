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
        while (temporary != null) {
            wynik += temporary.getMyString() + ",";
            temporary = temporary.getNextElemnt();
        }
        return wynik;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void remove(String element) {

        //3 warianty
        //usuwanie pierwszego elementu
                //przecstawic firstElement na "drugi" obiekt listy
                //w usuwanym elemencie ustawic next na null
        //usuwanie srodkowego elementu
        //usuwanie ostatniego elementu


        if(this.firstElement.getMyString().equals(element)) {
            MyElement temporary = this.firstElement;
            this.firstElement = this.firstElement.getNextElemnt();
        }
        else {
//           temporary = firstElement;
//            while (!temporary.getNextElemnt().
//                    getMyString().equals(element)) {
//
//                temporary = temporary.getNextElemnt();
//            }



        }



    }


    private boolean listIsEmpty() {
        return this.firstElement == null;

    }
}

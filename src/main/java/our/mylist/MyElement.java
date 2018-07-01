package our.mylist;

public class MyElement {

    private String myString;
    private MyElement nextElemnt;

    public MyElement(String myElementString) {
        this.myString = myElementString;
        this.nextElemnt = null;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyElement getNextElemnt() {
        return nextElemnt;
    }

    public void setNextElemnt(MyElement nextElemnt) {
        this.nextElemnt = nextElemnt;
    }
}

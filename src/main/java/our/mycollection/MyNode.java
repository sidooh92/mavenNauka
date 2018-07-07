package our.mycollection;

public class MyNode {

    private String myString;
    private MyNode nextElemnt;

    public MyNode(String myElementString) {
        this.myString = myElementString;
        this.nextElemnt = null;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public MyNode getNextElemnt() {
        return nextElemnt;
    }

    public void setNextElemnt(MyNode nextElemnt) {
        this.nextElemnt = nextElemnt;
    }
}

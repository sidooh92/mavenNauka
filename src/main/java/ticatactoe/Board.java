package ticatactoe;

public class Board {
    public String[][] table;

    public Board() {
        this.table = new String[3][3];
    }


    public void emptyTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = "";
            }

        }
    }
}

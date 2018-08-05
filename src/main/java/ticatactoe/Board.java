package ticatactoe;

import ticatactoe.exception.OutOfTablePositionException;
import ticatactoe.exception.WrongMoveException;
import ticatactoe.exception.WrongPositionException;
import ticatactoe.exception.WrongSymbolException;

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

    public void move(int i, int j, String symbol) throws WrongMoveException, WrongSymbolException, WrongPositionException {
        if(i >= table.length || j >= table.length) {
            throw new WrongPositionException("Unallwed position");
        }

        if (!symbol.matches("x|o|X|O")) {
            throw new WrongSymbolException("Unallwed symbol");
        }
        if (!table[i][j].equalsIgnoreCase("")) {
            throw new WrongMoveException("Position already taken");
        }
        table[i][j] = symbol;

    }

    public String getPostionValue(int i, int j) throws OutOfTablePositionException {
        if(i >= table.length || j >= table.length) {
            throw new OutOfTablePositionException("Unallwed position");
        }
        return table[i][j];
    }
}

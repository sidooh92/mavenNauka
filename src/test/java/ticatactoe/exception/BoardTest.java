package ticatactoe.exception;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ticatactoe.Board;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)

public class BoardTest {

    private static Logger log =
            LoggerFactory.getLogger(BoardTest.class);

    @Test
    public void shouldCreateBoard()
    {
        Board board = new Board();
        assertThat(board.table).isNotNull();
    }

    @Test
    public void shouldCheckIfBoardIsEmpty()
    {
        //given
        Board board = new Board();
        String[][] correctTableState = {{"", "", ""},{"", "", ""},{"", "", ""}};
        //when
       board.emptyTable();
       //then
        assertThat(board.table).containsExactly(correctTableState);

    }

    @Test
    public void shouldAddCorrectMove() throws WrongMoveException, WrongSymbolException, WrongPositionException, OutOfTablePositionException {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"X");
        //then
        assertThat(board.getPostionValue(1,1)).isEqualTo("X");
    }

    @Test(expected = WrongMoveException.class)
    public void shouldNotAddWrongMoveSameTwice() throws WrongMoveException, WrongSymbolException, WrongPositionException {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"X");
        board.move(1,1,"X");
    }

    @Test(expected = WrongSymbolException.class)
    public void shouldNotAddWrongMoveWrongSymbol() throws WrongMoveException, WrongSymbolException, WrongPositionException {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"Z");
    }


    @Test(expected = WrongPositionException.class)
    public void shouldNotAddWrongMoveWrongPositions() throws WrongMoveException, WrongSymbolException, WrongPositionException {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(4,1,"X");
    }


    @Test
    public void shouldGetValueOfSelectedPositionInBoard() throws OutOfTablePositionException {
        //given
        Board board = new Board();
        //when
        board.emptyTable();
        //then
        assertThat(board.getPostionValue(1,1)).isEqualTo("");
    }

    @Test(expected = OutOfTablePositionException.class)
    public void shouldNotGetValueOfSelectedPositionOutBoard() throws OutOfTablePositionException {
        //given
        Board board = new Board();
        //when
        board.getPostionValue(4,4);
    }
}

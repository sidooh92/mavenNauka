package tictactoe;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import machine.SodaMachineTest;
import org.assertj.core.data.Offset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ticatactoe.Board;

import java.util.ArrayList;
import java.util.List;

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
    public void shouldAddCorrectMove() {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"X");
        //then
        assertThat(board.getPostionValue(1,1)).isEqualTo("X");
    }

    @Test(expected = WrongMoveException.class)
    public void shouldNotAddWrongMoveSameTwice() {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"X");
        board.move(1,1,"X");
    }

    @Test(expected = WrongSymbolException.class)
    public void shouldNotAddWrongMoveWrongSymbol() {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(1,1,"A");
    }


    @Test(expected = WrongPositionException.class)
    public void shouldNotAddWrongMoveWrongPositions() {
        //given
        Board board = new Board();
        board.emptyTable();
        //when
        board.move(4,1,"X");
    }


    @Test
    public void shouldGetValueOfSelectedPositionInBoard() {
        //given
        Board board = new Board();
        //when
        board.emptyTable();
        //then
        assertThat(board.getPostionValue(1,1)).isEqualTo("");
    }

    @Test(expected = OutOfTablePositionException.class)
    public void shouldNotGetValueOfSelectedPositionOutBoard() {
        //given
        Board board = new Board();
        //when
        assertThat(board.getPostionValue(4,4));
    }
}

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

    }

    @Test
    public void shouldNotAddWrongMoveSameTwice() {

    }

    @Test
    public void shouldNotAddWrongMoveWrongSymbol() {

    }


    @Test
    public void shouldNotAddWrongMoveWrongPositions() {

    }


    @Test
    public void shouldGetValueOfSelectedPositionInBoard() {

    }

    @Test
    public void shouldNotGetValueOfSelectedPositionOutBoard() {

    }
}

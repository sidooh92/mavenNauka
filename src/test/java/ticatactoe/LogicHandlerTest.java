package ticatactoe;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import ticatactoe.exception.OutOfTablePositionException;
import ticatactoe.exception.WrongMoveException;
import ticatactoe.exception.WrongPositionException;
import ticatactoe.exception.WrongSymbolException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class LogicHandlerTest {
    @Test
    public void shouldCreateHandlerClass() {


    }

    @Test
    public void shouldAcceptPlayerMove() throws WrongMoveException, WrongSymbolException, WrongPositionException, OutOfTablePositionException {
        //given
        Player p1 = new Player("X");
        Board board = new Board();
        Game game = new Game(p1, p2,board);
        //when
        int[] ints = game.move(p1);
//
        //given
        assertThat(board.getPostionValue(ints[0],ints[1]))
                .isEqualToIgnoringCase("X");

    }

}

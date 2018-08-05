package ticatactoe.exception;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ticatactoe.Board;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class LogicServiceTest {
    private static Logger log =
            LoggerFactory.getLogger(LogicServiceTest.class);


    @Test
    public void shouldCheckEmptyBoard() {
        // , ,
        //o   O
        //o   O
        //false
    }

    @Test
    public void shouldCheckRowWinConditions() {
        //X,x,x
        //o O O
        //o O O
        //true
    }

    @Test
    public void shouldCheckColumnWinConditions() {
        //X,O,O
        //X O O
        //X O O
        //true
    }

    @Test
    public void shouldCheckCrossWinConditions() {
        //X,O,O
        //o x O
        //o O x
        //true

    }

}

package ticatactoe.exception;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ticatactoe.Board;
import ticatactoe.LogicService;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class LogicServiceTest {
    private static Logger log =
            LoggerFactory.getLogger(LogicServiceTest.class);


    @Test
    public void shouldCheckEmptyBoard() {
        String[][] correctTableState = {{"X", "", "X"},
                {"O", "", ""},
                {"", "O", ""}};
        LogicService logicService = new LogicService();
        //when
        //then
        assertThat(logicService.check(correctTableState)).isNull();
    }

    @Test
    public void shouldCheckRowWinConditions() {
        //given
        String[][] correctTableState = {{"X", "X", "X"},
                                         {"O", "", ""},
                                          {"", "O", ""}};
        LogicService logicService = new LogicService();
        //when
        //then
        assertThat(logicService.check(correctTableState)).isEqualTo("X");
    }

    @Test
    public void shouldCheckColumnWinConditions() {
        //given
        String[][] correctTableState = {{"X", "O", "O"},
                {"X", "", ""},
                {"X", "O", ""}};
        LogicService logicService = new LogicService();
        //when
        //then
        assertThat(logicService.check(correctTableState)).isEqualTo("X");
    }

    @Test
    public void shouldCheckCrossWinConditions() {
        //given
        String[][] correctTableState = {{"X", "O", "O"},
                {"O", "X", ""},
                {"X", "O", "X"}};
        LogicService logicService = new LogicService();
        //when
        //then
        assertThat(logicService.check(correctTableState)).isEqualTo("X");
    }

}

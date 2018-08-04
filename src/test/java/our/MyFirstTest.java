package our;

import lotr.FellowshipOfTheRing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.*;

public class MyFirstTest {
    private static Logger log = LoggerFactory.getLogger(MyFirstTest.class);


    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");
        // basic assertions
        assertThat("SAURON").isEqualTo("Frodo");
    }


    @Test
    public void shouldCheckIfSaouronIsInTeamAndSizeIs5() {
        //given
        FellowshipOfTheRing fellowship = new FellowshipOfTheRing();
        //then
        assertThat(fellowship.team)
                                    .hasSize(5)
                                    .doesNotContain("Saouron");
    }

    @Test
    public void shouldAddGimliToTeamAndSizeIs6(){
    //given
        FellowshipOfTheRing fellowship = new FellowshipOfTheRing();
     //when
        fellowship.team.add("Gimli");
        //then
        assertThat(fellowship.team).hasSize(6).contains("Gimli");
    }



    @Test
    public void shouldRemoveAllHumansAndCheckIfStillContainsLegolas()
    {


    }

}

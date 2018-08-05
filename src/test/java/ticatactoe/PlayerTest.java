package ticatactoe;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {

    @Test
    public void shouldCreatePlayer() {
        Player player = new Player("X");

        assertThat(player).isNotNull();
        assertThat(player.getType()).isEqualTo("X");
    }


    @Test
    public void shouldReturnPositionFromInput() {
        //given
        Player mockPlayer = mock(Player.class);
        when(mockPlayer
                .getInput()).thenReturn("1,1");
        when(mockPlayer
                .parseInput(Mockito.any(String.class)))
                .thenCallRealMethod();
        //when
        String readInputFormConsole = mockPlayer.getInput();
        int[] positions = mockPlayer.parseInput(readInputFormConsole);

        //then
        assertThat(positions).containsExactly(1, 1);

    }

}

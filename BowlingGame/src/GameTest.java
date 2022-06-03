import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/*
  /*
  this project Create by Ayoub BENHAIMOUD
  using Java 11 and JUnit4 for testing
  Contact me for more information

*/

public class GameTest {

    private  Game game;
    @Before
    public  void setUp(){
        game = new Game();
    }
    @Test
    public void canScoreGutterGame(){
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }
    @Test
    public void canScoreOfOnes() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }

    @Test
    public void canScoreSpareFollowedByThree(){
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(),is(16));
    }
    @Test
    public void canScoreStrikeFollowedBThreeThenThree(){
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(),is(22));
    }
    @Test
    public void canScorePerfectGame(){
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(game.score(),is(300));
    }





}

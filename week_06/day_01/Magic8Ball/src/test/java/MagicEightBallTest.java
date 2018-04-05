import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicEightBallTest {

    private MagicEightBall ball;

    @Before
    public void before(){
        String[] myAnswers = {"Yes", "No", "Maybe"};
        ArrayList<String> answers = new ArrayList<>(Arrays.asList(myAnswers));
        this.ball = new MagicEightBall(answers);
    }

    @Test
    public void MagicEightBallHasAnswers(){
        assertEquals(3, this.ball.numberOfAnswers());
    }

    @Test
    public void canGetRandom(){
        ArrayList<String> copy = this.ball.getAnswers();
        String randomAnswer = this.ball.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer(){
        ball.addAnswer("I don't know");
        assertEquals(4, this.ball.numberOfAnswers());
    }

    @Test
    public void canRemoveAnswer(){
        ball.removeAnswer(2);
        assertEquals(2, this.ball.numberOfAnswers());
    }
}

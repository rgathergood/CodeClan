import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {
    private ArrayList<String> answers;

    public MagicEightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int numberOfAnswers() {
        return this.answers.size();
    }

    public ArrayList<String> getAnswers(){
        ArrayList<String> copyOfAnswers = new ArrayList<>(this.answers);
        return copyOfAnswers;
    }

    public String getAnswerAtIndex(int index){
        return this.answers.get(index);
    }

    public String getRandomAnswer() {
        Collections.shuffle(this.answers);
        return answers.get(0);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(int answer) {
        this.answers.remove(answer);
    }
}

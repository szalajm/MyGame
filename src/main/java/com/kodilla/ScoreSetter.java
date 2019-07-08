package com.kodilla;

import javafx.scene.control.Label;

public class ScoreSetter {

    private QAndAs theQuestion;
    private Label playerScore1;
    private Label playerScore2;

    public ScoreSetter(QAndAs theQuestion, Label playerScore1, Label playerScore2) {
        this.theQuestion = theQuestion;
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore2;
    }

    public void setScore() {
        if (theQuestion.getScore() < 10000) {
            playerScore1.setText("Your score is" + theQuestion.getScore());
            playerScore2.setText("Your guaranteed win is 0");
        } else if (theQuestion.getScore() >= 10000 && theQuestion.getScore() < 75000) {
            playerScore1.setText("Your score is" + theQuestion.getScore());
            playerScore2.setText("Your guaranteed win is 10000");
        } else if (theQuestion.getScore() >= 75000 && theQuestion.getScore() < 125000) {
            playerScore1.setText("Your score is" + theQuestion.getScore());
            playerScore2.setText("Your guaranteed win is 75000");
        } else if (theQuestion.getScore() >= 125000 && theQuestion.getScore() < 1000000) {
            playerScore1.setText("Your score is" + theQuestion.getScore());
            playerScore2.setText("Your guaranteed win is 125000");
        } else {
            playerScore1.setText("Your score is" + theQuestion.getScore());
            playerScore2.setText("Your guaranteed win is 1000000!!!");
        }
    }
}

package com.kodilla;

import com.kodilla.QAndAs;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ButtonAction {

        private QAndAs theQuestion;
        private Text questionBody;
        private VBox questionLadder;
        private NewQuestion newQuestion;
        private FinishedQuestion finishedQuestion;


        public ButtonAction(QAndAs theQuestion, Text questionBody, VBox questionLadder, NewQuestion newQuestion, FinishedQuestion finishedQuestion) {
            this.theQuestion = theQuestion;
            this.questionBody = questionBody;
            this.questionLadder = questionLadder;
            this.newQuestion = newQuestion;
            this.finishedQuestion = finishedQuestion;
        }

        public void setButtonAction(int buttonIndex) {
            if (theQuestion.getCorrectAnswerIndex() == buttonIndex && theQuestion.getScore() == 1000000) {
                questionBody.setText("JESTE\u015A MILIONEREM!!!");
                questionLadder.setDisable(true);
            } else if (theQuestion.getCorrectAnswerIndex() == buttonIndex && theQuestion.getScore() != 1000000) {
                questionBody.setText("CORRECT ANSWER!");
                questionLadder.setDisable(true);
                newQuestion.setNewQuestion();
                finishedQuestion.setFinishedQuestion();
            } else {
                questionBody.setText("GAME OVER!");
                questionLadder.setDisable(true);
            }
        }

    }

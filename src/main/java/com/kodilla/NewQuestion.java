package com.kodilla;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.List;

import static javafx.scene.paint.Color.YELLOW;

public class NewQuestion {


    private VBox questionLadder;
    private Text questionBody;
    private List<String> valueList;

    public NewQuestion(VBox questionLadder, Text questionBody, List<String> valueList) {
        this.questionLadder = questionLadder;
        this.questionBody = questionBody;
        this.valueList = valueList;
    }

    public void setNewQuestion(Integer current) {

        if(questionBody.getText().equals("GAME OVER!")) {
            return;
        } else {
            System.out.println("current" + current);

            HBox box = (HBox) questionLadder.getChildren().get(current);
            box.setStyle("-fx-background-color: red; -fx-padding: 6px; -fx-border-color: red; -fx-border-width: 5 px; -fx-alignment: center");
            Text text = new Text(valueList.get(current));
            text.setFill(YELLOW);
        }
    }
}

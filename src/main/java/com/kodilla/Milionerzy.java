package com.kodilla;

import com.sun.rowset.internal.Row;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Background;


import java.util.*;


public class Milionerzy extends Application {

    private Image backImage = new Image("studio.jpg");


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(backImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);


        QAndAsMap theMap = new QAndAsMap();


        VBox questionLadder = new VBox(3);

        questionLadder.setStyle("-fx-pref-height: 100%; -fx-pref-width: 70%; -fx-background-color: orange; -fx-border-color: white; -fx-border-width: 3,3,3,3");


        HBox answers = new HBox(1);
        answers.setStyle("-fx-max-width: 800; -fx-max-height: 70; -fx-border-color: red; -fx-border-width: 5px");
        answers.setAlignment(Pos.BOTTOM_CENTER);

        Button answer1 = new Button();
        answer1.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer1.setTextFill(Color.WHITE);
        answer1.setWrapText(true);
        answer1.setPrefSize(200, 70);


        Button answer2 = new Button();
        answer2.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer2.setTextFill(Color.WHITE);
        answer2.setWrapText(true);
        answer2.setPrefSize(200, 70);

        Button answer3 = new Button();
        answer3.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer3.setTextFill(Color.WHITE);
        answer3.setWrapText(true);
        answer3.setPrefSize(200, 70);

        Button answer4 = new Button();
        answer4.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer4.setTextFill(Color.WHITE);
        answer4.setWrapText(true);
        answer4.setPrefSize(200, 70);


        answers.getChildren().addAll(answer1, answer2, answer3, answer4);

        StackPane questionPane = new StackPane();
        Rectangle questionBox = new Rectangle(400, 100);
        questionBox.setFill(Color.BLACK);
        questionBox.setStroke(Color.DARKBLUE);
        Text questionBody = new Text();
        questionBody.setFont(Font.font(18));
        questionBody.setFill(Color.WHITE);
        questionBody.setWrappingWidth(300);
        questionPane.getChildren().addAll(questionBox, questionBody);

        HBox scores = new HBox(1);
        scores.setStyle("-fx-background-color: blue; -fx-max-height: 1000%; -fx-pref-width: 100%; -fx-border-color: red; -fx-border-width: 5px");

        Label playerScore1 = new Label();
        playerScore1.setStyle("-fx-border-color: white");
        playerScore1.setTextFill(Color.WHITE);
        playerScore1.setMinSize(250, 70);

        Label playerScore2 = new Label();
        playerScore2.setStyle("-fx-border-color: white");
        playerScore2.setTextFill(Color.WHITE);
        playerScore2.setMinSize(250, 70);

        scores.getChildren().add(playerScore2);
        scores.getChildren().add(playerScore1);

        List<String> valueList = Arrays.asList("500", "1000", "2000", "5000", "10000", "20000", "40000", "75000", "125000", "250000", "500000", "1000000");
        for (String value : valueList) {
            // Random random = new Random();
            // Integer n = random.nextInt(4);
            HBox box = new HBox();
            box.setStyle("-fx-padding: 6px; -fx-border-color: red; -fx-border-width: 5 px; -fx-alignment: center");
            Text text = new Text(value);
            text.setStyle("-fx-font-size: 20px; -webkit-fx-padding-bottom: 2px");
            box.getChildren().add(text);
            questionLadder.getChildren().add(box);
        }

        NewQuestion newQuestion = new NewQuestion(questionLadder, questionBody, valueList);

        class FinishedQuestion {

            Integer current =0;
            QAndAs actualQuestion = theMap.getActualQuestion(valueList.get(current));

            public void setQuestion() {
                actualQuestion = theMap.getActualQuestion(valueList.get(current));
                questionBody.setText(actualQuestion.getQuestionBody());
                answer1.setText(actualQuestion.getAnswers().get(0));
                answer2.setText(actualQuestion.getAnswers().get(1));
                answer3.setText(actualQuestion.getAnswers().get(2));
                answer4.setText(actualQuestion.getAnswers().get(3));

                answer1.setDisable(false);
                answer2.setDisable(false);
                answer3.setDisable(false);
                answer4.setDisable(false);
            }

            public void setButtonAction(){

                answer1.setOnAction(event -> {
                    answer2.setDisable(true);
                    answer3.setDisable(true);
                    answer4.setDisable(true);
                    if (actualQuestion.getCorrectAnswerIndex() == 0 && actualQuestion.getScore() == 1000000) {
                        questionBody.setText("JESTE\u015A MILIONEREM!!!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                    } else if (actualQuestion.getCorrectAnswerIndex() == 0 && actualQuestion.getScore() != 1000000) {
                        questionBody.setText("CORRECT ANSWER!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                        setQuestion();
                    } else {
                        questionBody.setText("GAME OVER!");
                        questionLadder.setDisable(true);
                    }
                    ScoreSetter score1 = new ScoreSetter(actualQuestion, playerScore1, playerScore2);
                    score1.setScore();
                });
                answer2.setText(actualQuestion.getAnswers().get(1));
                answer2.setOnAction(event -> {
                    answer1.setDisable(true);
                    answer3.setDisable(true);
                    answer4.setDisable(true);
                    if (actualQuestion.getCorrectAnswerIndex() == 1 && actualQuestion.getScore() == 1000000) {
                        questionBody.setText("JESTE\u015A MILIONEREM!!!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                    } else if (actualQuestion.getCorrectAnswerIndex() == 1 && actualQuestion.getScore() != 1000000) {
                        questionBody.setText("CORRECT ANSWER!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                        setQuestion();
                    } else {
                        questionBody.setText("GAME OVER!");
                        questionLadder.setDisable(true);
                    }
                    ScoreSetter score2 = new ScoreSetter(actualQuestion, playerScore1, playerScore2);
                    score2.setScore();
                });
                answer3.setText(actualQuestion.getAnswers().get(2));
                answer3.setOnAction(event -> {
                    answer1.setDisable(true);
                    answer2.setDisable(true);
                    answer4.setDisable(true);
                    if (actualQuestion.getCorrectAnswerIndex() == 2 && actualQuestion.getScore() == 1000000) {
                        questionBody.setText("JESTE\u015A MILIONEREM!!!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                    } else if (actualQuestion.getCorrectAnswerIndex() == 2 && actualQuestion.getScore() != 1000000) {
                        questionBody.setText("CORRECT ANSWER!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                        setQuestion();
                    } else {
                        questionBody.setText("GAME OVER!");
                        questionLadder.setDisable(true);
                    }
                    ScoreSetter score3 = new ScoreSetter(actualQuestion, playerScore1, playerScore2);
                    score3.setScore();
                });
                answer4.setText(actualQuestion.getAnswers().get(3));
                answer4.setOnAction(event -> {
                    answer1.setDisable(true);
                    answer2.setDisable(true);
                    answer3.setDisable(true);
                    if (actualQuestion.getCorrectAnswerIndex() == 3 && actualQuestion.getScore() == 1000000) {
                        questionBody.setText("JESTE\u015A MILIONEREM!!!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                    } else if (actualQuestion.getCorrectAnswerIndex() == 3 && actualQuestion.getScore() != 1000000) {
                        questionBody.setText("CORRECT ANSWER!");
                        questionLadder.setDisable(true);
                        newQuestion.setNewQuestion(current++);
                        setQuestion();
                    } else {
                        questionBody.setText("GAME OVER!");
                        questionLadder.setDisable(true);
                    }
                    ScoreSetter score4 = new ScoreSetter(actualQuestion, playerScore1, playerScore2);
                    score4.setScore();
                });
            }
        }

        FinishedQuestion finishedQuestion = new FinishedQuestion();
        finishedQuestion.setQuestion();
        finishedQuestion.setButtonAction();

        GridPane theGrid = new GridPane();
        theGrid.setBackground(background);
        theGrid.setAlignment(Pos.CENTER);

            theGrid.setPadding(new Insets(10, 10, 10, 10));

            ColumnConstraints column1 = new ColumnConstraints();
            column1.setPercentWidth(60);

            ColumnConstraints column2 = new ColumnConstraints();
            column2.setPercentWidth(40);

            RowConstraints row1 = new RowConstraints();
            row1.setPercentHeight(80);

            RowConstraints row2 = new RowConstraints();
            row2.setPercentHeight(20);

            theGrid.getColumnConstraints().addAll(column1, column2);
            theGrid.getRowConstraints().addAll(row1, row2);

            theGrid.add(questionPane, 0, 0);

            theGrid.add(answers, 0, 1);

            theGrid.add(questionLadder, 1, 0);

            theGrid.add(scores,1,1);


            Scene theScene = new Scene(theGrid, 1600, 900, Color.BLACK);

            primaryStage.setTitle("Milionerzy");
            primaryStage.setScene(theScene);
            primaryStage.show();
        }
    }



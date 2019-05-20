package com.kodilla;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import org.w3c.dom.*;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.awt.*;
import java.util.Stack;

import static javafx.scene.paint.Color.CYAN;
import static javafx.scene.paint.Color.YELLOW;


public class Milionerzy extends Application {

    private Image backImage = new Image("studio.jpg");

    public static void main (String[]args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(backImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        VBox questionLadder = new VBox(30);

        questionLadder.getChildren().add(new Text("500"));
        questionLadder.getChildren().add(new Text("1000"));
        questionLadder.getChildren().add(new Text("2000"));
        questionLadder.getChildren().add(new Text("5000"));
        questionLadder.getChildren().add(new Text("10000"));
        questionLadder.getChildren().add(new Text ("20000"));
        questionLadder.getChildren().add(new Text("40000"));
        questionLadder.getChildren().add(new Text("75000"));
        questionLadder.getChildren().add(new Text("125000"));
        questionLadder.getChildren().add(new Text("250000"));
        questionLadder.getChildren().add(new Text("500000"));
        questionLadder.getChildren().add(new Text("1000000"));

        questionLadder.setMinWidth(400);
        questionLadder.setMinHeight(550);
        questionLadder.setMaxWidth(500);
        questionLadder.setMaxHeight(800);

        questionLadder.setStyle("-fx-background-color: orange; -fx-border-color: white; -fx-border-width: 3,3,3,3");
        questionLadder.setAlignment(Pos.CENTER);


        Button answer1 = new Button("answer1");
        answer1.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer1.setTextFill(Color.WHITE);
        answer1.setWrapText(true);
        answer1.setPrefSize(150, 70);

        Button answer2 = new Button("answer2");
        answer2.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer2.setTextFill(Color.WHITE);
        answer2.setWrapText(true);
        answer2.setPrefSize(150, 70);

        Button answer3 = new Button("answer3");
        answer3.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer3.setTextFill(Color.WHITE);
        answer3.setWrapText(true);
        answer3.setPrefSize(150, 70);

        Button answer4 = new Button("answer4");
        answer4.setStyle("-fx-background-color: black; -fx-border-color: white; -fx-border-width: 3, 3, 3,3");
        answer4.setTextFill(Color.WHITE);
        answer4.setWrapText(true);
        answer4.setPrefSize(150, 70);

        HBox answers = new HBox(1);
        answers.getChildren().addAll(answer1, answer2, answer3, answer4);

        StackPane questionPane = new StackPane();
        Rectangle questionBox = new Rectangle(400, 100);
        questionBox.setFill(Color.BLACK);
        questionBox.setStroke(Color.DARKBLUE);
        Text questionBody = new  Text("What is love?");
        questionBody.setFont(Font.font(20));
        questionBody.setFill(Color.WHITE);
        questionPane.getChildren().addAll(questionBox, questionBody);


        GridPane theGrid = new GridPane();
            theGrid.setBackground(background);
            theGrid.setAlignment(Pos.TOP_LEFT);
            theGrid.setHgap(5.5);
            theGrid.setVgap(20);
            theGrid.setPadding(new Insets(10, 10,10, 10));

            theGrid.add(questionPane, 0,0);

            theGrid.add(answers, 0,1);

            theGrid.add(questionLadder, 2, 0);


            Scene theScene = new Scene(theGrid, 1600, 900, Color.BLACK);

            primaryStage.setTitle("Milionerzy");
            primaryStage.setScene(theScene);
            primaryStage.show();
        }

}

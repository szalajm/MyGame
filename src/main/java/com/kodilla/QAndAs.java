package com.kodilla;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class QAndAs {

    private String questionBody;
    private String level;
    private Integer score;
    private List<String> answers;
    private Integer correctAnswerIndex;


    public QAndAs(String questionBody, String level, Integer score, Integer correctAnswerIndex, String... answers) {
        this.questionBody = questionBody;
        this.level = level;
        this.score = score;
        this.correctAnswerIndex = correctAnswerIndex;
        this.answers = Arrays.asList(answers);
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public String getLevel() {
        return level;
    }

    public Integer getScore(){
        return score;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return answers.get(correctAnswerIndex);
    }

    public Integer getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QAndAs question = (QAndAs) o;
        return questionBody.equals(question.questionBody) &&
                level.equals(question.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionBody, level);
    }
}


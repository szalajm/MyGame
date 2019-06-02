package com.kodilla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerScore {
    private List<Integer> scoresList = new ArrayList<>();

    public void addScore(Integer theScore) {
        scoresList.add(theScore);
    }

    public Integer totalScore() {
        Integer sum = 0;
        for (int i = 0; i < scoresList.size(); i++) {
            sum += scoresList.get(i);
        }
        return sum;
        }

}







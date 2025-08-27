import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        ArrayList<Integer> topThree = new ArrayList<>(highScores);
        topThree.sort((a, b) -> b - a);
        return topThree.subList(0, Math.min(3, topThree.size()));
    }

}

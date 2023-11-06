package study.racingcar;


import java.util.stream.Collectors;

public class Round {

    private final Cars participateCars;

    public Round(Cars cars) {
        this.participateCars = cars;
    }

    public void race(ScoreBoard scoreBoard) {
        ScoreEachRound scoreEachRound = new ScoreEachRound(participateCars.carlist().stream()
                        .map(Score::new)
                        .collect(Collectors.toList())
        );
        scoreBoard.score(scoreEachRound);
    }
}

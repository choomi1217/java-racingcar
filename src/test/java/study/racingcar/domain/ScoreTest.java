package study.racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.racingcar.domain.car.Car;
import study.racingcar.domain.score.Score;
import study.racingcar.fake.FailRandomGenratorStub;
import study.racingcar.fake.SuccessRandomGenratorStub;
import study.racingcar.util.MoveStatus;
import study.racingcar.util.RandomGenerator;

class ScoreTest {

    private final Car car = new Car("name");
    private final RandomGenerator successRandomGenratorStub = new SuccessRandomGenratorStub(new Random());

    private final RandomGenerator failRandomGenratorStub = new FailRandomGenratorStub(new Random());

    @DisplayName("차의 움짐임에 따라 점수를 char로 반환 - 차가 움직였을 때")
    @Test
    void whenCarMoveMustReturnCharacter(){
        Score score = new Score(car, successRandomGenratorStub);
        assertThat(score.scoreMoveStatus()).isEqualTo(MoveStatus.MOVE);
    }

    @DisplayName("차의 움짐임에 따라 점수를 char로 반환 - 차가 움직이지 않았을 때")
    @Test
    void whenCarStopMustReturnCharacter(){
        Score score = new Score(car, failRandomGenratorStub);
        assertThat(score.scoreMoveStatus()).isEqualTo(MoveStatus.STOP);
    }
}
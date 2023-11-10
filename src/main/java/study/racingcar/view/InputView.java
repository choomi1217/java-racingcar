package study.racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private static final String SPLIT_SEPARATOR = ",";

    public List<String> initCar(){
        String carNames = scanner.next();
        return Arrays.stream(carNames.split(SPLIT_SEPARATOR))
            .collect(Collectors.toList());
    }

    public int initRound(){
        return scanner.nextInt();
    }

}
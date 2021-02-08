package racingCar.utils;

import java.util.Random;

public class RandomUtils {
    private final static Random RANDOM = new Random();

    public static int nextInt(int start, int end) {
        if (start < 0 || start > end) {
            throw new RuntimeException("입력 값을 확인해주세요.");
        }
        if (start == end) {
            return start;
        }
        return RANDOM.nextInt(end - start + 1) + start;
    }
}

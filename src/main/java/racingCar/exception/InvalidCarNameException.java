package racingCar.exception;

public class InvalidCarNameException extends RuntimeException {
    public InvalidCarNameException(String s){
        super("[ERROR] " + s);
    }
}

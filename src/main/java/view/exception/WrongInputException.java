package view.exception;

import java.io.IOException;

public class WrongInputException extends IOException {
    @Override
    public String getMessage() {
        return ("Wrong input");
    }
}

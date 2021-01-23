package pl.sda.javalondek4.java_demo.exception;

public class NoNickRunTimeException extends RuntimeException{
    public NoNickRunTimeException() {
    }

    public NoNickRunTimeException(String message) {
        super(message);
    }

    public NoNickRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickRunTimeException(Throwable cause) {
        super(cause);
    }

    public NoNickRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package ticatactoe.exception;

public class WrongMoveException extends Exception {
    public WrongMoveException(String msg) {
        super(msg);
    }
}

package trans.transactional.exception;

public class InsufficientAmountException extends RuntimeException {

    public InsufficientAmountException(String message){
        super(message);
    }
}

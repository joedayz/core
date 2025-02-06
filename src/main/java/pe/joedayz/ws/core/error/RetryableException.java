package pe.joedayz.ws.core.error;

/**
 * @author josediaz
 **/
public class RetryableException extends RuntimeException {

  public RetryableException(String message) {
    super(message);
  }

  public RetryableException(Exception exception) {
    super(exception);
  }
}

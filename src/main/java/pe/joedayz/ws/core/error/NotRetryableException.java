package pe.joedayz.ws.core.error;

/**
 * @author josediaz
 **/
public class NotRetryableException extends RuntimeException {
  public NotRetryableException(String message) {
    super(message);
  }

  public NotRetryableException(Exception exception) {
    super(exception);
  }
}

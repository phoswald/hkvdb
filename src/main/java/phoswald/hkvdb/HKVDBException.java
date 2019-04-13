package phoswald.hkvdb;

public class HKVDBException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public HKVDBException(String message) {
        super(message);
    }

    public HKVDBException(String message, Throwable cause) {
        super(message, cause);
    }
}

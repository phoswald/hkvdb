package phoswald.hkvdb;

import java.util.Iterator;
import java.util.Optional;

public interface Session extends AutoCloseable {

    @Override
    public void close();

    // *** Querying and browsing

    public default boolean exists(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default boolean isSimple(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default boolean isComplex(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default Iterator<byte[]> list(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default Iterator<byte[][]> walk(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    // *** Operations on Files

    public default Optional<byte[]> read(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default void write(byte[][] key, byte[] val) {
        throw new UnsupportedOperationException();
    }

    // *** Operations on Directories

    public default void createDirectory(byte[][] key) {
        throw new UnsupportedOperationException();
    }

    public default void createDirectories(byte[][] key) {
        throw new UnsupportedOperationException();
    }

//  public default void delete(byte[][] key) {
//      write(key, null);
//  }
}

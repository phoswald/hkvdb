package phoswald.hkvdb.mem;

import java.util.Objects;

final class SimpleNode implements Node {

    private final byte[] bytes;

    SimpleNode(byte[] bytes) {
        this.bytes = Objects.requireNonNull(bytes);
    }
}

package phoswald.hkvdb.mem;

import static org.junit.Assert.assertNull;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

import phoswald.hkvdb.Session;

public class MemorySessionTest {

    private Session testee = new MemorySession(new ComplexNode());

    @Test
    public void testTopLevel() {
        assertNull(testee.read(path("one")));
    }

    private static byte[] value(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    private static byte[][] path(String... parts) {
        byte[][] result = new byte[parts.length][];
        for(int i = 0; i < parts.length; i++) {
            result[i] = value(parts[i]);
        }
        return result;
    }
}

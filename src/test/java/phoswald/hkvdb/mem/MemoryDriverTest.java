package phoswald.hkvdb.mem;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

import phoswald.hkvdb.SessionFactory;

public class MemoryDriverTest {

    private MemoryDriver testee = new MemoryDriver();

    @Test
    public void createFactory_memUnnamed_success() {
        Optional<SessionFactory> factory  = testee.createFactory("hkvdb:mem");
        assertTrue(factory.isPresent());
        assertTrue(factory.get() instanceof MemorySessionFactory);
    }

    @Test
    public void createFactory_memNamed_success() {
        Optional<SessionFactory> factory  = testee.createFactory("hkvdb:mem:myname");
        assertTrue(factory.isPresent());
        assertTrue(factory.get() instanceof MemorySessionFactory);
    }

    @Test
    public void createFactory_memUnnamed_sameAsDefault() {
        Optional<SessionFactory> factory1  = testee.createFactory("hkvdb:mem");
        Optional<SessionFactory> factory2  = testee.createFactory("hkvdb:mem:default");
        assertSame(factory1.get(), factory2.get());
    }

    @Test
    public void createFactory_other_notPresent() {
        assertFalse(testee.createFactory("hkvdb:foo:bar").isPresent());
    }
}

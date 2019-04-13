package phoswald.hkvdb.mem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class MemorySessionFactoryTest {

    @Test
    public void getInstance_equalName_same() {
        MemorySessionFactory instance1 = MemorySessionFactory.getInstance("foo");
        MemorySessionFactory instance2 = MemorySessionFactory.getInstance("foo");
        assertNotNull(instance1);
        assertSame(instance1, instance2);
    }

    @Test
    public void getInstance_differentName_notSame() {
        MemorySessionFactory instance1 = MemorySessionFactory.getInstance("foo");
        MemorySessionFactory instance2 = MemorySessionFactory.getInstance("bar");
        assertNotNull(instance1);
        assertNotSame(instance1, instance2);
    }

    @Test(expected=NullPointerException.class)
    public void getInstance_nullName_exception() {
        MemorySessionFactory.getInstance(null);
    }
}

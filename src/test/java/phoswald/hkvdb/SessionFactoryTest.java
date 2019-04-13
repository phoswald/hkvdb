package phoswald.hkvdb;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SessionFactoryTest {

    @Test
    public void createFactory_mem_success() {
        SessionFactory factory = SessionFactory.createFactory("hkvdb:mem");
        assertNotNull(factory);
    }

    @Test(expected=HKVDBException.class)
    public void createFactory_other_exception() {
        SessionFactory.createFactory("hkvdb:foo:bar");
    }
}

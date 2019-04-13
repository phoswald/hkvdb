package phoswald.hkvdb;

import java.util.Iterator;
import java.util.Optional;
import java.util.ServiceLoader;

public interface SessionFactory {

    public Session createSession();

    public static SessionFactory createFactory(String url) {
        Iterator<Driver> iterator = ServiceLoader.load(Driver.class).iterator();
        while(iterator.hasNext()) {
            Driver driver = iterator.next();
            Optional<SessionFactory> factory = driver.createFactory(url);
            if(factory.isPresent()) {
                return factory.get();
            }
        }
        throw new HKVDBException("No driver for url='" + url + "'.");
    }
}

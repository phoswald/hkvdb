package phoswald.hkvdb.mem;

import java.util.Optional;

import phoswald.hkvdb.Driver;
import phoswald.hkvdb.SessionFactory;

public class MemoryDriver implements Driver {

    @Override
    public Optional<SessionFactory> createFactory(String url) {
        if(url.equals("hkvdb:mem")) {
            return Optional.of(MemorySessionFactory.getInstance("default"));
        }
        if(url.startsWith("hkvdb:mem:")) {
            return Optional.of(MemorySessionFactory.getInstance(url.substring(10)));
        }
        return Optional.empty();
    }
}

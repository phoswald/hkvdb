package phoswald.hkvdb;

import java.util.Optional;

public interface Driver {

    public Optional<SessionFactory> createFactory(String url);
}

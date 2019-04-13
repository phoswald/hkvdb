package phoswald.hkvdb.mem;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import phoswald.hkvdb.Session;
import phoswald.hkvdb.SessionFactory;

class MemorySessionFactory implements SessionFactory {

    private static final ConcurrentMap<String, MemorySessionFactory> instances = new ConcurrentHashMap<>();

    private final ComplexNode state = new ComplexNode();

    private MemorySessionFactory() { }

    static MemorySessionFactory getInstance(String name) {
        Objects.requireNonNull(name);
        return instances.computeIfAbsent(name, x -> new MemorySessionFactory());
    }

    @Override
    public Session createSession() {
        return new MemorySession(state);
    }
}

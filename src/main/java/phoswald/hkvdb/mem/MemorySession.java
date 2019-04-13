package phoswald.hkvdb.mem;

import phoswald.hkvdb.Session;

class MemorySession implements Session {

    private final ComplexNode state;

    MemorySession(ComplexNode state) {
        this.state = state;
    }

    @Override
    public void close() { }
}

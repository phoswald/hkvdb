package phoswald.hkvdb.mem;

import java.util.SortedMap;
import java.util.TreeMap;

final class ComplexNode implements Node {

    private final SortedMap<byte[], Node> children = new TreeMap<>();
}

package our.mymap;

import java.util.List;
import java.util.Set;

public interface OurMap<K, V> {
    void put(K key, V value);

    V get(K key);

    void remove(K key);

    boolean contains(K key);

    List<V> values();

    Set<K> keySet();

    int size();
}

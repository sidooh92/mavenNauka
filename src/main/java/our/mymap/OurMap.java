package our.mymap;

import java.util.Arrays;

public class OurMap<K, V> {
    private int size;
    private int baseSize = 10;
    private OurMapEntry<K, V>[] values;


    public OurMap() {
        this.values = new OurMapEntry[baseSize];
        this.size = 0;
    }

    public void put(K key, V value) {
        boolean updated = false;
        for (int i = 0; i < size; i++) {
            if (values[i].getKey().equals(key)) {
                values[i].setValue(value);
                updated = true;
            }
        }
        if (!updated) {
            makeOurArrayBigger();
            values[size] = new OurMapEntry<K, V>(key, value);
            size++;
        }
    }

    private void makeOurArrayBigger() {
        if ((size - 2) == values.length) {
            values = Arrays.copyOf(values, values.length * 4);
        }
    }

    public V get(K key) {
        return null;
    }

    public int size() {
        return size;
    }

}

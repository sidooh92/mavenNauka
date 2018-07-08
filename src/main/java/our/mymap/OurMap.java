package our.mymap;

public class OurMap<K, V> {
    private int size;
    private int baseSize = 10;
    private OurMapEntry<K,V>[] values;


    public OurMap() {
        this.values = new OurMapEntry[baseSize];
        this.size = 0;
    }

    public void put(K key, V value) {
        //2 przypadki
            for(int i=0; i < size; i++) {
                //(1) rekord z takim kluczem juz jest w tabeli  ->
                // aktualizujemy wartosc
            }
        //(2) nie klucza w tabeli -> wpisujemy nowy rekord w
        // kolejne wolne miejsce w tabeli
        value[size++] = new OurMapEntry<K,V>(key,value);

    }

    public V get(K key) {
        return null;
    }

    public int size() {
        return size;
    }

}

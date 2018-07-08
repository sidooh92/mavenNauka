package our.mymap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OurMapEntry<K, V> {

    private K key;
    private V value;

}

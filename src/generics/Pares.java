package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {
  private final Set<Par<K,V>> items = new LinkedHashSet<>();  // LinkedHashSet Garante Ordenação pela ordem de inclusão.

  public void adicionar(K key, V value) {
    if (key == null) return;

    Par<K, V> newPair = new Par<K, V>(key, value);

    if (items.contains(newPair)) {
      items.remove(newPair);
    }

    items.add(new Par<K, V>(key, value));
  }

  public V getValue(K key) {
    if (key == null) return null;
    Optional<Par<K,V>> par = items.stream().filter(x -> key.equals(x.getKey())).findFirst();

//     return par.isPresent()? par.get().getValue() : null;
    return par.map(Par::getValue).orElse(null);
  }

}

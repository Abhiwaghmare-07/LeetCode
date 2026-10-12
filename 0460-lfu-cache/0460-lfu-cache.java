
import java.util.*;

class LFUCache {
    int cap, minFreq;
    Map<Integer, Integer> val = new HashMap<>();
    Map<Integer, Integer> freq = new HashMap<>();
    Map<Integer, LinkedHashSet<Integer>> groups = new HashMap<>();

    public LFUCache(int capacity) {
        cap = capacity;
    }

    public int get(int key) {
        if (!val.containsKey(key)) return -1;

        int f = freq.get(key);
        groups.get(f).remove(key);

        if (f == minFreq && groups.get(f).isEmpty())
            minFreq++;

        freq.put(key, f + 1);
        groups.computeIfAbsent(f + 1, k -> new LinkedHashSet<>()).add(key);

        return val.get(key);
    }

    public void put(int key, int value) {
        if (cap == 0) return;

        if (val.containsKey(key)) {
            val.put(key, value);
            get(key);
            return;
        }

        if (val.size() == cap) {
            int old = groups.get(minFreq).iterator().next();
            groups.get(minFreq).remove(old);
            val.remove(old);
            freq.remove(old);
        }

        val.put(key, value);
        freq.put(key, 1);
        minFreq = 1;
        groups.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
    }
}

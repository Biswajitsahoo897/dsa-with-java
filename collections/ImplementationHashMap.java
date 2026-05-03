package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class ImplementationHashMap {
    static class MyHashMap<K, V> {
        private static class Node<K, V> {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node<K, V>>[] buckets;
        private int n;
        private int N;

        @SuppressWarnings("unchecked")
        MyHashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            if (key == null) {
                return 0;
            }
            return Math.abs(key.hashCode()) % N;
        }

        private int searchInBucket(K key, int bucketIndex) {
            LinkedList<Node<K, V>> bucket = buckets[bucketIndex];
            for (int i = 0; i < bucket.size(); i++) {
                if (Objects.equals(bucket.get(i).key, key)) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node<K, V>>[] oldBuckets = buckets;
            N = N * 2;

            @SuppressWarnings("unchecked")
            LinkedList<Node<K, V>>[] newBuckets = new LinkedList[N];
            buckets = newBuckets;
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (LinkedList<Node<K, V>> bucket : oldBuckets) {
                for (Node<K, V> node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInBucket(key, bucketIndex);

            if (dataIndex == -1) {
                buckets[bucketIndex].add(new Node<>(key, value));
                n++;
            } else {
                buckets[bucketIndex].get(dataIndex).value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInBucket(key, bucketIndex);
            return dataIndex != -1;
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInBucket(key, bucketIndex);

            if (dataIndex == -1) {
                return null;
            }
            return buckets[bucketIndex].get(dataIndex).value;
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInBucket(key, bucketIndex);

            if (dataIndex == -1) {
                return null;
            }

            Node<K, V> removedNode = buckets[bucketIndex].remove(dataIndex);
            n--;
            return removedNode.value;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node<K, V>> bucket : buckets) {
                for (Node<K, V> node : bucket) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public ArrayList<V> values() {
            ArrayList<V> values = new ArrayList<>();
            for (LinkedList<Node<K, V>> bucket : buckets) {
                for (Node<K, V> node : bucket) {
                    values.add(node.value);
                }
            }
            return values;
        }

        public int size() {
            return n;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public void clear() {
            for (LinkedList<Node<K, V>> bucket : buckets) {
                bucket.clear();
            }
            n = 0;
        }

        public V getOrDefault(K key, V defaultValue) {
            V value = get(key);
            return value == null ? defaultValue : value;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            boolean first = true;

            for (LinkedList<Node<K, V>> bucket : buckets) {
                for (Node<K, V> node : bucket) {
                    if (!first) {
                        sb.append(", ");
                    }
                    sb.append(node.key).append("=").append(node.value);
                    first = false;
                }
            }

            sb.append("}");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("india", 100);
        map.put("usa", 90);
        map.put("uk", 80);
        map.put("australia", 120);
        map.put("india", 150);

        System.out.println("Map: " + map);
        System.out.println("Contains india: " + map.containsKey("india"));
        System.out.println("Contains china: " + map.containsKey("china"));
        System.out.println("Get usa: " + map.get("usa"));
        System.out.println("Remove uk: " + map.remove("uk"));
        System.out.println("Current map: " + map);
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
    }
}

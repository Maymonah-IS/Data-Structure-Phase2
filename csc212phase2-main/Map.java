/**
 * A map of unique comparable keys to values, supporting efficient search, insertion, and deletion.
 *
 * @param <K> the key type (must be comparable)
 * @param <T> the value type
 */
public interface Map<K extends Comparable<? super K>, T> {

    /**
     * Returns the number of key–value pairs in the map.
     */
    int size();

    /**
     * Returns true if the map is empty.
     * Must run in O(1).
     */
    boolean empty();

    /**
     * Removes all entries from the map.
     */
    void clear();

    /**
     * Inserts a new key–value pair if the key does not already exist.
     *
     * @param key  the key to insert
     * @param data the associated value
     * @return true if insertion was successful, false if the key already exists
     * <p>
     * Must run in O(log n) on average.
     */
    boolean insert(K key, T data);

    /**
     * Returns the value associated with the given key.
     *
     * @param key the key to search for
     * @return the associated value, or null if the key does not exist
     * <p>
     * Must run in O(log n) on average.
     */
    T get(K key);

    /**
     * Updates the value associated with the given key.
     *
     * @param key the key to update
     * @param e   the new value
     * @return true if the key exists and was updated, false otherwise
     */
    boolean update(K key, T e);

    /**
     * Removes the entry associated with the given key.
     *
     * @param key the key to remove
     * @return true if the key existed and was removed, false otherwise
     * <p>
     * Must run in O(log n) on average.
     */
    boolean remove(K key);

    /**
     * Returns the number of key comparisons performed while searching for the key.
     *
     * @param key the key to search for
     * @return number of comparisons required to determine presence or absence
     */
    int nbKeyComp(K key);

    /**
     * Returns all keys in the map in increasing sorted order.
     *
     * @return a sorted list of keys
     */
    List<K> getKeys();
}
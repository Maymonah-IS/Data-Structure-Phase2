/**
 * A set of unique comparable keys, supporting efficient search, insertion, and deletion.
 *
 * @param <K> the key type (must be comparable)
 */
public interface Set<K extends Comparable<? super K>> {
    /**
     * Returns the number of elements in the set.
     */
    int size();

    /**
     * Returns true if the set is empty.
     * Must run in O(1).
     */
    boolean empty();

    /**
     * Removes all elements from the set.
     */
    void clear();

    /**
     * Checks whether the given key exists in the set.
     *
     * @param k the key to search for
     * @return true if the key exists, false otherwise
     * 
     * Must run in O(log n) on average.
     */
    boolean contains(K k);

    /**
     * Returns the number of key comparisons performed while searching for the key.
     *
     * @param k the key to search for
     * @return number of comparisons required to determine presence or absence
     */
    int nbKeyComp(K k);

    /**
     * Inserts the given key if it does not already exist.
     *
     * @param k the key to insert
     * @return true if insertion was successful, false if the key already exists
     * 
     * Must run in O(log n) on average.
     */
    boolean insert(K k);

    /**
     * Removes the given key if it exists.
     *
     * @param k the key to remove
     * @return true if the key existed and was removed, false otherwise
     * 
     * Must run in O(log n) on average.
     */
    boolean remove(K k);

    /**
     * Returns all keys in increasing sorted order.
     *
     * @return a sorted list of keys
     */
    List<K> getKeys();
}
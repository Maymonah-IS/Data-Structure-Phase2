

//start
/**
 * Stores unique keys and their corresponding values using a BST structure.
 * Allows adding, removing, and retrieving elements efficiently.
 *
 * @param <K> represents the key type
 * @param <T> represents the stored data type
 */
public class BSTMap<K extends Comparable<? super K>, T> implements Map<K, T> {

    class BSTMapNode<K extends Comparable<? super K>, T> {

        public K key;
        public T data;
        public BSTMapNode<K, T> left, right;

        public BSTMapNode(K key, T data) {
            this.key = key;
            this.data = data;
            left = null;
            right = null;
        }
    }

    // =================================================

    BSTMapNode<K, T> root;
    BSTMapNode<K, T> current;
    int count;

    public BSTMap() {
        root = null;
        current = null;
        count = 0;
    }

    /**
     * Returns number of elements in the map.
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * Checks if the map is empty.
     * Runs in O(1).
     */
    @Override
    public boolean empty() {
        return root == null;
    }

    /**
     * Removes all elements from the map.
     */
    @Override
    public void clear() {
        root = null;
        current = null;
        count = 0;
    }

    /**
     * Inserts a new key-value pair if the key does not exist.
     *
     * @param key key to insert
     * @param data associated value
     * @return true if insertion succeeds, otherwise false
     */

 // Inserts a new key-value pair if the key does not already exist.
 
@Override
public boolean insert(K key, T data)
{
    if (root == null)
    {
        curr = root = new BSTMapNode<K, T>(key, data);
        count++;
        return true;
    }

    // search for insertion position
    BSTMapNode<K, T> pBstNode = root;
    BSTMapNode<K, T> qBSTNode = null;

    while (pBstNode != null)
    {
        int compareResult = key.compareTo(pBstNode.key);

        if (compareResult == 0)
            return false;
        else
        {
            qBSTNode = pBstNode;

            if (compareResult < 0)
                pBstNode = pBstNode.left;
            else
                pBstNode = pBstNode.right;
        }
    }

    BSTMapNode<K, T> newNode = new BSTMapNode<K, T>(key, data);

    if (key.compareTo(qBSTNode.key) < 0)
        qBSTNode.left = newNode;
    else
        qBSTNode.right = newNode;

    curr = newNode;
    count++;

    return true;
}



 // Returns the value associated with the given key.
 
@Override
public T get(K key)
{
    BSTMapNode<K, T> pBstNode = root;

    while (pBstNode != null)
    {
        if (key.compareTo(pBstNode.key) == 0)
            return pBstNode.data;

        else if (key.compareTo(pBstNode.key) < 0)
            pBstNode = pBstNode.left;

        else
            pBstNode = pBstNode.right;
    }

    return null;
}



 // Updates the value associated with the given key.

@Override
public boolean update(K key, T e)
{
    BSTMapNode<K, T> pBstNode = root;

    while (pBstNode != null)
    {
        if (key.compareTo(pBstNode.key) == 0)
        {
            pBstNode.data = e;
            return true;
        }

        else if (key.compareTo(pBstNode.key) < 0)
            pBstNode = pBstNode.left;

        else
            pBstNode = pBstNode.right;
    }

    return false;
}

/**
 * Removes the entry associated with the given key.
 *
 * @param key the key to remove
 * @return true if key was found and removed, otherwise false
 */
@Override
public boolean remove(K key)
{
    // search for key
    K targetKey = key;

    BSTMapNode<K, T> p = root;
    BSTMapNode<K, T> q = null;

    while (p != null)
    {
        if (targetKey.compareTo(p.key) < 0)
        {
            q = p;
            p = p.left;
        }

        else if (targetKey.compareTo(p.key) > 0)
        {
            q = p;
            p = p.right;
        }

        else
        {
            // key found

            if ((p.left != null) && (p.right != null))
            {
                // node has two children

                BSTMapNode<K, T> min = p.right;
                q = p;

                while (min.left != null)
                {
                    q = min;
                    min = min.left;
                }

                p.key = min.key;
                p.data = min.data;

                targetKey = min.key;
                p = min;
            }

            if (p.left != null)
                p = p.left;

            else
                p = p.right;

            if (q == null)
                root = p;

            else
            {
                if (targetKey.compareTo(q.key) < 0)
                    q.left = p;

                else
                    q.right = p;
            }

            count--;
            return true;
        }
    }

    return false;
}

    /**
 * Returns the number of comparisons performed while searching for a key.
 *
 * @param key key to search for
 * @return number of key comparisons
 */
@Override
public int nbKeyComp(K key)
{
    int comparisons = 0;

    BSTMapNode<K, T> pBstNode = root;

    while (pBstNode != null)
    {
        comparisons++;

        if (key.compareTo(pBstNode.key) == 0)
            break;

        else if (key.compareTo(pBstNode.key) < 0)
            pBstNode = pBstNode.left;

        else
            pBstNode = pBstNode.right;
    }

    return comparisons;
}


/**
 * Returns all keys sorted in increasing order.
 *
 * @return sorted list of keys
 */
@Override
public List<K> getKeys()
{
    List<K> keys = new LinkedList<K>();

    private_getKeys(root, keys);

    return keys;
}

public void private_getKeys(BSTMapNode<K, T> node, List<K> keys)
{
    if (node == null)
        return;

    private_getKeys(node.left, keys);

    keys.insert(node.key);

    private_getKeys(node.right, keys);
}


public class BSTSet<K extends Comparable<? super K>>  implements Set<K>  {
	
	
	class BSTSetNode<K extends Comparable<? super K>> {
		public K key;
		public BSTSetNode<K> left, right;
		public BSTSetNode(K key) {
			this.key = key;
			right=null;
			left=null;
		}
	}
	
	private BSTSetNode<K> root;
	private BSTSetNode<K> current;
	private int count;
	public BSTSet() {
		root=current=null;
		count=0;
		}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean empty() {
		return ( root == null);
	}

	@Override
	public void clear() {
        root = current = null;
        count = 0 ;
	}

	@Override
	public boolean contains(K k) {
        BSTSetNode <K> pNode = root;
        while(pNode!=null) {
        	
        	if (k.compareTo(pNode.key) == 0) 
                return true;
        	
        	else if (k.compareTo(pNode.key) <0 )
        		pNode = pNode.left;
        	else       
                pNode = pNode.right;
        	
        		
        }
        return false;

	}

	@Override
	public int nbKeyComp(K k) {
		int counter=0;
		BSTSetNode <K> pNode = root;
		while (pNode!= null) 
        {
            counter++;
            if (k.compareTo(pNode.key) == 0) 
                break;
            else if (k.compareTo(pNode.key) <0 )
                   pNode = pNode.left;
            else       
                   pNode = pNode.right;
        }
        return counter;
	}

	

    /**
     * Inserts the given key if it does not already exist.
     *
     * @param k the key to insert
     * @return true if insertion was successful, false if the key already exists
     * 
     * Must run in O(log n) on average.
     */
	@Override
    public boolean insert(K k)
    {
         if (root == null) 
        {
            current = root = new BSTSetNode<K>(k);
            count ++ ;
            return true;
        }
        
        
        BSTSetNode <K> pNode = root;
        BSTSetNode <K> qNode = null ;

        // serach for key
        while (pNode != null ) 
        {
            int rest = k.compareTo(pNode.key);
            if (rest == 0) 
                return false;
            else 
            {
                qNode = pNode ;
                if (rest < 0) 
                    pNode = pNode.left;
                else
                    pNode = pNode.right;
           }
        }
        
        BSTSetNode<K> tempNode = new BSTSetNode<K> (k);
        
        if (k.compareTo(qNode.key) < 0) 
            qNode.left = tempNode;
        else 
            qNode.right = tempNode;

        current = tempNode;
        count++ ;
        return true;
    }

	
	
    /**
     * Removes the given key if it exists.
     *
     * @param k the key to remove
     * @return true if the key existed and was removed, false otherwise
     * 
     * Must run in O(log n) on average.
     */
	@Override
	public boolean remove(K k) {
		// Search for k      
        K tempK = k;
        BSTSetNode <K> p = root;
        BSTSetNode <K> q = null;  //parent of p
        while (p != null) 
        {
            if  (tempK.compareTo(p.key) < 0) 
            {
                q =p;
                p = p.left;
            } 
            else if (tempK.compareTo(p.key) > 0) 
            {
                q = p;
                p = p.right;
            } 
            else //remove
            { 
                // Found the key,  three cases
               
                if ((p.left != null) && (p.right != null)) 
                { 
                    // Case 3: has two children ,,,,Search for the min in the right subtree               
       
                    BSTSetNode <K> min = p.right;
                    q = p;
                    while (min.left != null) 
                    {
                        q = min;
                        min = min.left;
                    } //we are in last node in left side
                    p.key = min.key;
                    tempK = min.key;
                    p = min;
                    
                    
                    
                }
             // Now fall back to either case 1 or 2
                // The subtree rooted at p will change here
                if (p.left != null) 
                    // One child
                    p = p.left;
                else 
                    // One or no children
                    p = p.right;
                if (q == null) 
                    // No parent for p, root must change
                        root = p;
                else 
                {
                    if (tempK.compareTo(q.key) < 0) 
                        q.left = p;
                    else 
                        q.right = p;
                }
                count --;
                return true;
            }
        }
        return false; // Not found
	}

	@Override
	public List<K> getKeys() {
		List<K> keys = new LinkedList <K> ();
        private_getKeys (root , keys);
        return keys;
	}
	
	private void private_getKeys(BSTSetNode <K> node , List<K> keys) {
		if ( node == null)
            return;
        
        private_getKeys ( node.left, keys);
        keys.insert(node.key);
        private_getKeys ( node.right, keys);
	}

}

# Seperate Chaining Codes

## CPP Code

> ```cpp
> // Container for our data-set
> class SeperateHash {
> // Data members are kept private since they are accessed using methods
>    private:
>       int n;
>       vector<vector<int> > v;
>   // Methods are kept public
>   public:
>   // Initialising constructors as the minimum required memory will be
>   // allocated after which compiler will not report flag error
>   SeperateHash(int n) {
>       // Constructor to initialize the vector of vectors
>       v = vector<vector<int> >(n);
>
>     	// Here, we will allocate memory of the unnamed_memory
>     	// to the object. This snippet of code won't work for now.
>     	// Program will work whenever constructor gets initialized
>
>     	this->n = n;
>     }
>
>     int getHashIndex(int x){
>     	return x % n;
>     }
>
>     void add(int x){
>     	// Adding the element according to hash index
>     	v[getHashIndex(x)].push_back(x);
>     }
>
>     void del(int x){
>     	int i = getHashIndex(x);
>
>     	// Scan for the element to be removed
>     	for (int j = 0; j < v[i].size(); j++) {
>
>     		// Erase if present otherwise print no element found!
>     		if (v[i][j] == x) {
>     			v[i].erase(v[i].begin() + j);
>     			cout << x << " deleted!" << endl;
>     			return;
>     		}
>     	}
>
>     	cout << "No Element Found!" << endl;
>     }
>
>     void displayHash()
>     {
>     	// Display the contents
>     	for (int i = 0; i < v.size(); i++) {
>     		cout << i;
>     		for (int j = 0; j < v[i].size(); j++)
>     			cout << " -> " << v[i][j];
>     		cout << endl;
>     	}
>     }
>
> };
> ```

## Java Code

> ```java
> /* Node for singly linked list */
> class SLLNode {
>
>    SLLNode next;
>    int data;
>
>    /* Constructor */
>    public SLLNode(int x)
>    {
>        data = x;
>        next = null;
>    }
>
>}
>
>/* Class HashTableChainingSinglyLinkedList */
>class HashTableChainingSinglyLinkedList {
>private SLLNode[] table;
>private int size ;
>
>    /* Constructor */
>    public HashTableChainingSinglyLinkedList(int tableSize)
>    {
>        table = new SLLNode[ nextPrime(tableSize) ];
>        size = 0;
>    }
>    /* Function to check if hash table is empty */
>    public boolean isEmpty()
>    {
>        return size == 0;
>    }
>    /* Function to clear hash table */
>    public void makeEmpty()
>    {
>        int l = table.length;
>        table = new SLLNode[l];
>        size = 0;
>    }
>    /* Function to get size */
>    public int getSize()
>    {
>        return size;
>    }
>    /* Function to insert an element */
>    public void insert(int val)
>    {
>        size++;
>        int pos = myhash(val);
>        SLLNode nptr = new SLLNode(val);
>        if (table[pos] == null)
>            table[pos] = nptr;
>        else
>        {
>            nptr.next = table[pos];
>            table[pos] = nptr;
>        }
>    }
>    /* Function to remove an element */
>    public void remove(int val)
>    {
>        int pos = myhash(val);
>        SLLNode start = table[pos];
>        SLLNode end = start;
>        if (start.data == val)
>        {
>            size--;
>            table[pos] = start.next;
>            return;
>        }
>        while (end.next != null && end.next.data != val)
>            end = end.next;
>        if (end.next == null)
>        {
>            System.out.println("\nElement not found\n");
>            return;
>        }
>        size--;
>        if (end.next.next == null)
>        {
>            end.next = null;
>            return;
>        }
>        end.next = end.next.next;
>        table[pos] = start;
>    }
>    /* Function myhash */
>    private int myhash(Integer x )
>    {
>        int hashVal = x.hashCode( );
>        hashVal %= table.length;
>        if (hashVal < 0)
>            hashVal += table.length;
>        return hashVal;
>    }
>    /* Function to generate next prime number >= n */
>    private static int nextPrime( int n )
>    {
>        if (n % 2 == 0)
>            n++;
>        for ( ; !isPrime( n ); n += 2);
>
>        return n;
>    }
>    /* Function to check if given number is prime */
>    private static boolean isPrime( int n )
>    {
>        if (n == 2 || n == 3)
>            return true;
>        if (n == 1 || n % 2 == 0)
>            return false;
>        for (int i = 3; i * i <= n; i += 2)
>            if (n % i == 0)
>                return false;
>        return true;
>    }
>    public void printHashTable ()
>    {
>        System.out.println();
>        for (int i = 0; i < table.length; i++)
>        {
>            System.out.print ("Bucket " + i + ":  ");
>            SLLNode start = table[i];
>            while(start != null)
>            {
>                System.out.print(start.data +" ");
>                start = start.next;
>            }
>            System.out.println();
>        }
>    }
>
>}
>
> ```

## Python Code
>
> ```python
> class HashTable:
>    # Initialize hash table
>    def __init__(self):
>    	self.capacity = INITIAL_CAPACITY
>    	self.size = 0
>    	self.buckets = [None]*self.capacity
>    # Generate a hash for a given key
>    # Input:  key - string
>    # Output: Index from 0 to self.capacity
>    def hash(self, key):
>    	hashsum = 0
>    	# For each character in the key
>    	for idx, c in enumerate(key):
>    		# Add (index + length of key) ^ (current char code)
>    		hashsum += (idx + len(key)) ** ord(c)
>    		# Perform modulus to keep hashsum in range [0, self.capacity - 1]
>    		hashsum = hashsum % self.capacity
>    	return hashsum
>
>    # Insert a key,value pair to the hashtable
>    # Input:  key - string
>    # 		  value - anything
>    # Output: void
>    def insert(self, key, value):
>    	# 1. Increment size
>    	self.size += 1
>    	# 2. Compute index of key
>    	index = self.hash(key)
>    	# Go to the node corresponding to the hash
>    	node = self.buckets[index]
>    	# 3. If bucket is empty:
>    	if node is None:
>    		# Create node, add it, return
>    		self.buckets[index] = Node(key, value)
>    		return
>    	# 4. Iterate to the end of the linked list at provided index
>    	prev = node
>    	while node is not None:
>    		prev = node
>    		node = node.next
>    	# Add a new node at the end of the list with provided key/value
>    	prev.next = Node(key, value)
>
>    # Find a data value based on key
>    # Input:  key - string
>    # Output: value stored under "key" or None if not found
>    def find(self, key):
>    	# 1. Compute hash
>    	index = self.hash(key)
>    	# 2. Go to first node in list at bucket
>    	node = self.buckets[index]
>    	# 3. Traverse the linked list at this node
>    	while node is not None and node.key != key:
>    		node = node.next
>    	# 4. Now, node is the requested key/value pair or None
>    	if node is None:
>    		# Not found
>    		return None
>    	else:
>    		# Found - return the data value
>    		return node.value
>
>    # Remove node stored at key
>    # Input:  key - string
>    # Output: removed data value or None if not found
>    def remove(self, key):
>    	# 1. Compute hash
>    	index = self.hash(key)
>    	node = self.buckets[index]
>    	prev = None
>    	# 2. Iterate to the requested node
>    	while node is not None and node.key != key:
>    		prev = node
>    		node = node.next
>    	# Now, node is either the requested node or none
>    	if node is None:
>    		# 3. Key not found
>    		return None
>    	else:
>    		# 4. The key was found.
>    		self.size -= 1
>    		result = node.value
>    		# Delete this element in linked list
>    		if prev is None:
>             # May be None, or the next match
>    			self.buckets[index] = node.next
>    		else:
>             # LinkedList delete by skipping
>    			prev.next = prev.next.next over
>    		# Return the deleted result
>    		return
> ```

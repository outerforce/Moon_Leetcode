#### Big Theta VS. Big O AND Big Omega
+ describe the rate of growth of the runtime
+ binary search &theta;(logN), equals f(N)
+ big O, less than or equal f(N)
+ find duplicates in an array, from O(1) to O(N<sup>2</sup>), it depends.
+ big Omega, great than or equal

#### BST VS. 2-3 Tree
+ BST needs rotation to maintain balance
+ 2-3 Tree needs splitting

#### 2-3 Tree
+ B-tree with M = 3 is called 2-3 Tree; M = 4 is called 2-3-4 Tree
+ M is # of children(max 3 items per node, max 4 non-null children oer node)
+ chain reaction(for splitting)
+ choose the left middle node and merge it into the parent node, split the rest nodes
+ by spliting tree, every node gets pushed down by exactly one level, height doesn't change
+ &theta;(logN) for insert() and contain()
+ issues: maintain different node types, interconversion of nodes from 2 and 3-nodes

#### Red-Black Tree
BST with below properties:
1. each node is black or red
2. root node is black
3. every red node has a black parent
4. all simple paths from a node to its descendant node have same # of black nodes
O(lgN) with N keys 

#### Hashing Table
+ hashcode: Integer between -2<sup>31</sup> to 2<sup>31</sup>-1
+ index = hashcode modulo M
+ if load factor gets too large, increase M(L = M/N)
+ &theta;(L) for insert() and contain(), resize with &theta;(1), no resizing &theta;(N)
+ external chaining(list for each bucket)
+ open addressing

#### Heap
+ min-heap: each node is <= both of its children
+ binary nim-heap: binary tree obeys min-heap property

### Summary
| Name | Storage Op | Retrieval Op | Retrieve by|
|:----:|:------------|:------------|:-----------|
| List | add(key)<br/>insert(key,index)| get(index)| index|
| Map  | put(key,value)|  get(key) |key|
| Set  | add(key) |  contains(key) |key|
| PQ   | add(key) |   getSmallest() |key order(key size)|
| Disjoint Sets | connect(p,q) | isconnected(p,q) |two int values|

### Advanced Trees
##### Depth First Traversals: pre, in and post
- preorder for print directory
- postorder for gather file size in folders

##### Level order traversal
iterative deepening running times:
+ bushy tree: &theta;(N)
+ spindly tree: &theta;(N<sup>2</sup>)


#### Graph representation
+ adjacency matrix &theta;(V<sup>2</sup>)
+ edge sets
+ adjacency lists(most popular) &theta;(V) to &theta;(V<sup>2</sup>)
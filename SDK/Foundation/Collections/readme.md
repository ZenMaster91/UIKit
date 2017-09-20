# Foundation > Datastructures
The DataStructures package includes all the types and structures that represent the core of the API. Example of that are the AVLTrees, the HashTables, Graphs and the Priority Queues.
   
## AVL Tree
###  Overview
In computer science, an AVL tree is a self-balancing binary search tree. It was the first such data structure to be invented.In an AVL tree, the heights of the two child subtrees of any node differ by at most one; if at any time they differ by more than one, rebalancing is done to restore this property. Lookup, insertion, and deletion all take O(log n) time in both the average and worst cases, where n is the number of nodes in the tree prior to the operation. Insertions and deletions may require the tree to be rebalanced by one or more tree rotations. --From Wikipedia.
You can create new AVL Trees as following:
```JAVA
  // AVL Tree that stores integer objects.
  AVLTree<Integer> intTree = new AVLTree<Integer>();

  // AVL Tree that stores string objects.
  AVLTree<String> stringTree = new AVLTree<String>();
```
As a result you have to know that the AVLTree constitutes a generic type, so can be instansiated with any type.
```JAVA
  // AVL Tree that stores integer objects.
  AVLTree<T> genericTree = new AVLTree<T>();
```
   
## Graph
In computer science, a graph is defined as a set of vertices paired with a set of edges. The vertices are represented by circles, and the edges are the lines between them. Edges connect a vertex to other vertices.

> **Note:** Vertices are sometimes called "nodes", and edges are called "links".
A graph can represent a social network. Each person is a vertex, and people who know each other are connected by edges.

To create a graph you can use:
```java
  // An integer graph for 5 nodes.
  Graph<Integer> integerGraph = new Graph<Integer>(5);
```
   
### Hash Table
A hash table allows you to store and retrieve objects by a "key".
A hash table is used to implement structures, such as a dictionary, a map, and an associative array. These structures can be implemented by a tree or a plain array, but it is efficient to use a hash table.
To create a new Hash Table you can use:
```java
  // A new hash table with an initial size of 7, a linear redispersion type and a 0.5 as a minimun load factor.
  HashTable<Integer> ht = new HashTable<Integer>(7, HashTable.LINEAR_PROBING, 0.5);
```
   
### Priority Queue
A  priority queue is a queue where the most important element is always at the front.
The queue can be a max-priority queue (largest element first) or a min-priority queue (smallest element first).
To create a new priority queue you can use:
```java
  // A new priority queue of integer elements.
  BinaryHeap<Integer> integerHeap;
```

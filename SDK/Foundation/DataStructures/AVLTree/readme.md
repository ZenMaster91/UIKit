# AVL Tree
### Overview
In computer science, an AVL tree is a self-balancing binary search tree. It was the first such data structure to be invented. In an AVL tree, the heights of the two child subtrees of any node differ by at most one; if at any time they differ by more than one, rebalancing is done to restore this property. Lookup, insertion, and deletion all take O(log n) time in both the average and worst cases, where n is the number of nodes in the tree prior to the operation. Insertions and deletions may require the tree to be rebalanced by one or more tree rotations.
The AVL tree is named after its two Soviet inventors, Georgy Adelson-Velsky and Evgenii Landis, who published it in their 1962 paper "An algorithm for the organization of information".
AVL trees are often compared with red–black trees because both support the same set of operations and take O(log n) time for the basic operations. For lookup-intensive applications, AVL trees are faster than red–black trees because they are more strictly balanced. Similar to red–black trees, AVL trees are height-balanced. Both are, in general, neither weight-balanced nor μ-balanced for any μ≤1⁄2, that is, sibling nodes can have hugely differing numbers of descendants. -- From Wikipedia.
 
 
> **Note:** An AVL Tree its compose by nodes, here we will refer to them as AVL Node.
  
### AVL Node
The AVL Node is the container that will store its value, a reference to the left and right childs and its height. For convinience we will make our node generic, but comparable to be able to compare the nodes between them.
  
```java
 public class AVLNode<T extends Comparable<T>> {
    
    // Its own element.
    private T element;
    
    // The left child
    private AVLNode<T> left;
    
    // The right child.
    private AVLNode<T> right;
    
    // The height of the node.
    private int height;
    
    ...
 }
```

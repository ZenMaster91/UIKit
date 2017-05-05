# AVL Tree
### Overview
In computer science, an AVL tree is a self-balancing binary search tree. It was the first such data structure to be invented. In an AVL tree, the heights of the two child subtrees of any node differ by at most one; if at any time they differ by more than one, rebalancing is done to restore this property. Lookup, insertion, and deletion all take O(log n) time in both the average and worst cases, where n is the number of nodes in the tree prior to the operation. Insertions and deletions may require the tree to be rebalanced by one or more tree rotations.
The AVL tree is named after its two Soviet inventors, Georgy Adelson-Velsky and Evgenii Landis, who published it in their 1962 paper "An algorithm for the organization of information".
AVL trees are often compared with red–black trees because both support the same set of operations and take O(log n) time for the basic operations. For lookup-intensive applications, AVL trees are faster than red–black trees because they are more strictly balanced. Similar to red–black trees, AVL trees are height-balanced. Both are, in general, neither weight-balanced nor μ-balanced for any μ≤1⁄2, that is, sibling nodes can have hugely differing numbers of descendants. -- From Wikipedia.
 
 
> **Note:** An AVL Tree its compose by nodes, here we will refer to them as AVL Node.
  
### AVL Node
#### Overview
The AVL Node is the container that will store its value, a reference to the left and right children and its height. For convinience we will make our node generic, but comparable to be able to compare the nodes between them.
  
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
#### Accesing and Setting values
The implementation of the AVL Node uses simple terminology sintax to name the methods. So if you want to set or get its properties can be done like this:
  
```java
    // A single node with no childs.
    AVLNode<int> single = new AVLNode<int>(1);
    
    // A node that will be left children.
    AVLNode<int> childLeft = new AVLNode<int>(3);
    
    // A node that will be right children.
    AVLNode<int> childRight = new AVLNode<int>(5);
    
    // A node defined as a parent with both children.
    AVLNode<int> parent = new AVLNode<int>(4, childLeft, childRight);
    
    // To access to the element stored on single.
    single.element();
    
    // To change or set the value of the element stored at single.
    single.element(2);
    
    // To get the left child of parent.
    parent.left();
    
    // To set or change the left child of parent.
    parent.left(new AVLNode<int>(2));
    
    // Same for left...
    
    // To get the height of any node.
    System.out.println(parent.height());
    // Will print 1;
    
```

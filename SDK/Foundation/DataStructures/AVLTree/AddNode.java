package Foundation.DataStructures.AVLTree;

/**
 * 
 * AddNode.java
 *
 * @author Guillermo Facundo Colunga
 * @version 1
 * @since 20171182017
 * @formatter Oviedo Computing Community
 * @param <T> Given from the tree.
 */
class AddNode<T extends Comparable<T>> {

	private AVLTree<T> tree;
	
	/**
	 * 
	 * @param tree
	 */
	protected AddNode(AVLTree<T> tree) {
		this.tree = tree;
	}
	
	/**
	 * Recursive add method. If the root given is null it will create a new
	 * AVLNode assigning the value of the node we want to add there. If not will
	 * allocate the element in its place and then will return again the root.
	 * 
	 * @param root of the AVL tree.
	 * @param element to be added to the tree.
	 * @return the root of the tree.
	 * @throws Exception if the element already exists or if it's null.
	 */
	protected AVLNode<T> add(AVLNode<T> root, T element) throws IllegalArgumentException {
		if (element == null) {
			throw new IllegalArgumentException(
					"The element you want to add was null.");
		} else if (root == null) {
			return new AVLNode<T>(element);
		} else if (root.element().equals(element)) {
			throw new IllegalArgumentException(
					"No repeated elements are allowed inside a tree.");
		} else if (element.compareTo(root.element()) < 0) {
			root.left(add(root.left(), element));
		} else {
			root.right(add(root.right(), element));
		}
		return (tree.updateBalanceFactor(root));
	}
}

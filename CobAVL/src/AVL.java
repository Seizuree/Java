class Pet implements Comparable<Pet> {
	private String name;
	private String type;

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int compareTo(Pet otherPet) {
		return name.compareTo(otherPet.getName());
	}

	public String toString() {
		return name + " (" + type + ")";
	}
}

class AVLNode {
	Pet data;
	AVLNode left;
	AVLNode right;
	int height;

	public AVLNode(Pet data) {
		this.data = data;
		this.height = 1;
	}
}

class AVLTree {
	AVLNode root;

	public AVLTree() {
		root = null;
	}

	public void insert(Pet data) {
		root = insert(root, data);
	}

	private AVLNode insert(AVLNode node, Pet data) {
		if (node == null) {
			return new AVLNode(data);
		}

		if (data.compareTo(node.data) < 0) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}

		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

		int balance = getBalance(node);

		if (balance > 1 && data.compareTo(node.left.data) < 0) {
			return rotateRight(node);
		}

		if (balance < -1 && data.compareTo(node.right.data) > 0) {
			return rotateLeft(node);
		}

		if (balance > 1 && data.compareTo(node.left.data) > 0) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}

		if (balance < -1 && data.compareTo(node.right.data) < 0) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}

		return node;
	}

	public void deleteByName(String name) {
	    root = deleteByName(root, name);
	}

	private AVLNode deleteByName(AVLNode node, String name) {
	    if (node == null) {
	        return null;
	    }

	    if (name.compareTo(node.data.getName()) < 0) {
	        node.left = deleteByName(node.left, name);
	    } else if (name.compareTo(node.data.getName()) > 0) {
	        node.right = deleteByName(node.right, name);
	    } else {
	        if (node.left == null || node.right == null) {
	            AVLNode temp = null;
	            if (temp == node.left) {
	                temp = node.right;
	            } else {
	                temp = node.left;
	            }

	            if (temp == null) {
	                temp = node;
	                node = null;
	            } else {
	                node = temp;
	            }
	        } else {
	            AVLNode temp = minValueNode(node.right);
	            node.data = temp.data;
	            node.right = deleteByName(node.right, temp.data.getName());
	        }
	    }

	    if (node == null) {
	        return null;
	    }

	    node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
	    int balance = getBalance(node);

	    if (balance > 1 && getBalance(node.left) >= 0) {
	        return rotateRight(node);
	    }

	    if (balance > 1 && getBalance(node.left) < 0) {
	        node.left = rotateLeft(node.left);
	        return rotateRight(node);
	    }

	    if (balance < -1 && getBalance(node.right) <= 0) {
	        return rotateLeft(node);
	    }

	    if (balance < -1 && getBalance(node.right) > 0) {
	        node.right = rotateRight(node.right);
	        return rotateLeft(node);
	    }

	    return node;
	}

	private AVLNode minValueNode(AVLNode node) {
	    AVLNode current = node;

	    while (current.left != null) {
	        current = current.left;
	    }

	    return current;
	}

	private int getHeight(AVLNode node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	private int getBalance(AVLNode node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	private AVLNode rotateRight(AVLNode node) {
		AVLNode left = node.left;
		AVLNode right = left.right;
		left.right = node;
		node.left = right;
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		left.height = 1 + Math.max(getHeight(left.left), getHeight(left.right));
		return left;
	}

	private AVLNode rotateLeft(AVLNode node) {
		AVLNode right = node.right;
		AVLNode left = right.left;
		right.left = node;
		node.right = left;
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		right.height = 1 + Math.max(getHeight(right.left), getHeight(right.right));
		return right;
	}

	public void printInOrder() {
		printInOrder(root);
	}

	private void printInOrder(AVLNode node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.println(node.data.toString());
		printInOrder(node.right);
	}


}

public class AVL {
	public static void main(String[] args) {
	    AVLTree tree = new AVLTree();

	    Pet pet1 = new Pet("Fluffy", "cat");
	    Pet pet2 = new Pet("Buddy", "dog");
	    Pet pet3 = new Pet("Coco", "dog");
	    Pet pet4 = new Pet("Lucky", "cat");
	    Pet pet5 = new Pet("Rocky", "dog");

	    tree.insert(pet1);
	    tree.insert(pet2);
	    tree.insert(pet3);
	    tree.insert(pet4);
	    tree.insert(pet5);

	    System.out.println("Initial tree:");
	    tree.printInOrder();

	    tree.deleteByName("Buddy");

	    System.out.println("\nAfter deleting Buddy:");
	    tree.printInOrder();

	    tree.deleteByName("Fluffy");

	    System.out.println("\nAfter deleting Fluffy:");
	    tree.printInOrder();
	}
}

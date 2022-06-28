
class Node {

    int data = 0;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinarySearchTree {

    static Node root;

    BinarySearchTree() {
        root = null; 
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int d) {
        if (root == null) {
            return new Node(d);
        }
        if (root.data > d) {
            root.left = insert(root.left, d);
        }
        if (root.data < d) {
            root.right = insert(root.right, d);
        }
        return root;
    }

    static void delkey(int key) {
        root = delete(root, key);
    }

    static Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    static int minValue(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.left == null) {
            return root.data;
        }
        return minValue(root.left);
    }

    public static void main(String args[]) {
        root = insert(root, 15);
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 8);
        root = insert(root, 12);
        root = insert(root, 16);
        root = insert(root, 25);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        delkey(8);
        inorder(root);
        System.out.println();
        delkey(10);
        inorder(root);
        System.out.println();
        delkey(20);
        inorder(root);
    }
}

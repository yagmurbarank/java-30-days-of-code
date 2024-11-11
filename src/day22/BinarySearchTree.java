package src.day22;
import java.util.*;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public class BinarySearchTree {

        public static Node insert(Node root, int data) {
            if (root == null) {
                return new Node(data);
            } else {
                if (data <= root.data) {
                    root.left = insert(root.left, data);
                } else {
                    root.right = insert(root.right, data);
                }
                return root;
            }
        }

        public static int getHeight(Node root) {
            if (root == null) {
                return -1;
            }

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Node root = null;

            for (int i = 0; i < n; i++) {
                int data = scanner.nextInt();
                root = insert(root, data);
            }

            scanner.close();
            int height = getHeight(root);
            System.out.println(height);

        }

    }

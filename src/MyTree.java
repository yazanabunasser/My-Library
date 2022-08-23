import java.util.concurrent.RecursiveTask;
public class MyTree {
    static class Node {
        int size;
        String name;
        Node left, right;

        Node(int size, String name) {
            this.size = size;
            this.name = name;
            left = null;
            right = null;
        }
    }

    public void add(Node node, Book b) {
        if (b.getSize() < node.size ) {
            if (node.left != null) {
                add(node.left, b);
            } else {
                System.out.println(" Inserted " + b + " to left of " + node);
                node.left = new Node(b.getSize(), b.getName());
            }
        } else if (b.getSize() > node.size|| b.getSize() == node.size) {
            if (node.right != null) {
                add(node.right, b);
            } else {
                System.out.println("  Inserted " + b + " to right of "
                        + node);
                node.right = new Node(b.getSize(), b.getName());
            }

        }
    }

    int succ(Node r) {
        r = r.right;
        while (r.left != null) {
            r = r.left;
        }
        return r.size;
    }

    int pre(Node r) {
        r = r.left;
        while (r.right != null) {
            r = r.right;
        }
        return r.size;
    }


    Node delete(Node root, int size) {

        if (root == null) {
            System.out.println("there are no book!!");
            return null;
        } else if (root.size < size) {
            if (root != null) {
                root.right = delete(root.right, size);
            }
        } else if (root.size > size) {
            if (root != null) {
                root.left = delete(root.left, size);
            }
        } else {
            if (root.left == null && root.right == null) root = null;
            else if (root.right != null) {
                root.size = succ(root);
                root.right = delete(root.right, root.size);
            } else {
                root.size = pre(root);
                root.left = delete(root.left, root.size);
            }


        }
        return root;
    }


    Node search(Node root , int size) {
        if (root == null) {
            System.out.println("there are no book!!");
            return null;
        }else if (root.size == size){
            System.out.println("i found it :" + root.name);
            return root;

        } else if (root.size < size) {
            root.right = search(root.right, size);

        } else if (root.size > size) {
            root.left = search(root.left, size);

        }

        return root;
    }

//    void print(TNode a) {
//        TNode temp = a;
//        if (temp == null) {
//            return;
//        }
//
//        System.out.println(temp.getBook() + " ");
//
//        if (temp.getRightNext() != null) {
//            print(temp.getRightNext());
//        }
//        if (temp.getLeftNext() != null) {
//            print(temp.getLeftNext());
//        }
//        return;
//    }


}


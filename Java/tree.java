import java.util.*;
public class tree
{
    Node root;
    tree()
    {
        root=null;
    }
    tree(int key)
    {
        root=new Node(key);
    }
    public void printInorder(Node node)
    {
        if (node == null)
            return;
 
        printInorder(node.left);
 
        System.out.print(node.data + " ");

        printInorder(node.right);
    }
    public void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        System.out.print(node.data + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    public void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.data + " ");

    }
    public void create()
    {
        tree t = new tree();
 
        /*create root*/
        t.root = new Node(1);
 
        /* following is the tree after above statement
 
              1
            /   \
          null  null     */
 
        t.root.left = new Node(2);  // Earlier this was "tree.root.<child name>"... but "tree" is the class name not object!
        t.root.right = new Node(3);  // Earlier this was "tree.root.<child name>"... but "tree" is the class name not object!
 
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */
 
 
        t.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        t.printPreorder(t.root); // Earlier You're passing only 'root' in this method.
        System.out.println();
        t.printInorder(t.root); // Earlier You're passing only 'root' in this method.
        System.out.println();
        t.printPostorder(t.root); // Earlier You're passing only 'root' in this method.
        System.out.println();
    }
    public static void main(String[] args)
    {
        tree t1 = new tree();
        t1.create();
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int key)
    {
        data=key;
        left=null;
        right=null;
    }
}

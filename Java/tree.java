import java.util.*;
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
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        /* 2 and 3 become left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */
 
 
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        t.printPreorder(root);
        System.out.println();
        t.printInorder(root);
        System.out.println();
        t.printPostorder(root);
        System.out.println();
    }
    public static void main(String[] args)
    {
        tree t1 = new tree();
        t1.create();
    }
}


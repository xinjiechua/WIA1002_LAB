package LAB11;

import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {
        Integer[] data = {45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14};
        BST<Integer> intTree = new BST<>(data);
        System.out.println("Input data: 45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14");
        System.out.print("Inorder (sorted): ");
        intTree.inorder();
        System.out.print("\nPostorder: ");
        intTree.postorder();
        System.out.print("\nPreorder: ");
        intTree.preorder();
        System.out.println("\nHeight of BST: "+intTree.height());
        System.out.println("Root of BST is: "+intTree.getRoot());
        System.out.println("Check whether 10 is in the tree? "+intTree.search(10));
        intTree.delete(53);
        System.out.println("Delete 53");
        System.out.print("Updated Inorder data (sorted): ");
        intTree.inorder();
        System.out.println("\nMin Value: "+intTree.minValue());
        System.out.println("Max Value: "+intTree.maxValue());
        System.out.print("A path from the root to 6 is: ");
        ArrayList<BST.TreeNode<Integer>> path = intTree.path(6);
        for(int i = 0; path != null && i < path.size(); i++) {
            System.out.print(path.get(i).element + " ");
        }
        System.out.println();
    }
}
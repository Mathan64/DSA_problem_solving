class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
       ArrayList<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }
    static void preorderTraversal(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.data);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

}

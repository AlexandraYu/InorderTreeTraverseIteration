import java.util.Stack;
class TreeNode {
    TreeNode root, left, right; 
    int data; 
    TreeNode(int input) {
        this.data = input; 
        this.root=null; 
        this.left=null; 
        this.right=null;
    }
}
public class InorderTreeTraverseIteration{
    public void inorderIter(TreeNode node) {
        TreeNode curr = node;
        Stack<TreeNode> myStack = new Stack<TreeNode>(); 
        if (node == null) return; 
        while (curr !=null || myStack.size()>0) { //if myStack.size() is 0 that means there's nothing in the stack, it's empty, it's important here cuz you don't want to pop something out from an empty stack
            while(curr !=null) {
                myStack.push(curr); 
                curr = curr.left;
            }//now curr is null
            //curr has been moved all the way to the most left and now null
            //it's time to pop from the stack
            System.out.printf("Is my stack empty? "+myStack.empty()+" ");
            curr = myStack.pop(); //here we move curr to the one previoius to it became null, which is on the top of the stack now, and is being popped
            System.out.printf(curr.data+" "+"\n"); 
            curr = curr.right;
        }
        
    }

     public static void main(String []args){
        TreeNode node1 = new TreeNode(1); 
        TreeNode node2 = new TreeNode(2); 
        TreeNode node3 = new TreeNode(3); 
        TreeNode node4 = new TreeNode(4); 
        TreeNode node5 = new TreeNode(5); 
    
        node1.left = node2; 
        node1.right = node3; 
        node2.left = node4; 
        node2.right = node5; 
        InorderTreeTraverseIteration traverse = new InorderTreeTraverseIteration();
        traverse.inorderIter(node1); 
     }
}

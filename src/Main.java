import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2, null, null);
        TreeNode node2 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(3, node1, node2);
        TreeNode node5 = new TreeNode(6, null, node3);
        TreeNode node6 = new TreeNode(5, node4, node5);
        LinkedList queue = new LinkedList();
        queue.add(node6);
        System.out.println("Size: " + queue.size());
        System.out.println("Mem add: " + queue);

        while (!queue.isEmpty()) {
            if (queue.peek() != null) {
                TreeNode node = (TreeNode) queue.remove();
                System.out.println("Node: " + node.val);
                queue.add(node.right);
                queue.add(node.left);
            } else {
                queue.remove();
                System.out.println("Node: null");
            }
            System.out.println("Size: " + queue.size());
            System.out.println("Mem add: " + queue);
        }
    }
}

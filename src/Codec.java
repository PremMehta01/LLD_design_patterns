
// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Codec {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(-7);
        TreeNode right = new TreeNode(-3);

        root.left = left;
        root.right = right;

        Codec ser = new Codec();
        Codec deser = new Codec();
        TreeNode ans = deser.deserialize(ser.serialize(root));

        System.out.println(ans.val);
        System.out.println(ans.left.val);
        System.out.println(ans.right.val);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serializedString = new StringBuilder();

        serialize(root, serializedString);

        System.out.println(serializedString.toString());

        return serializedString.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] idx = new int[]{0};

        return deserialize(values, idx);
    }


    private void serialize(TreeNode root, StringBuilder serializedString) {
        if(root == null) {
            serializedString.append("N,");
            return;
        }

        serializedString.append(root.val + ",");

        serialize(root.left, serializedString);
        serialize(root.right, serializedString);

    }

    private TreeNode deserialize(String[] values, int[] idx) {
        if(idx[0] >= values.length || values[idx[0]].equals("N")) {
            return null;
        }

        String curr = values[idx[0]];
        int numVal = Integer.parseInt(curr);

        TreeNode node = new TreeNode(numVal);

        idx[0]++;
        node.left = deserialize(values, idx);

        idx[0]++;
        node.right = deserialize(values, idx);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
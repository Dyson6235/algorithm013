class Solution_preorder_tranversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode node,List<Integer> ls){
        //二叉树的题目常用递归来解决问题。
        if(node!=null){
            ls.add(node.val);
            helper(node.left,ls);
            helper(node.right,ls);
        }
    }
}
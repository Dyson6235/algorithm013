
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution_narrayTree_level_order {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(res,root,0);
        return res;
    }


    private void bfs(List<List<Integer>> res,Node node,int level){
        if(node==null) return;
        if(res.size()==level) res.add(new LinkedList<>());
        res.get(level).add(node.val);
        for(int i=0;i<node.children.size();i++){
            bfs(res,node.children.get(i),level+1);
        }
    }
}

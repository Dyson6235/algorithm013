import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution_permutations_ii {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int num:nums){
            output.add(num);
        }
        int n = nums.length;
        backtrack(n,output,res,0);
        return res;
    }

    private void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int first){
        ArrayList solutionee = new ArrayList(output);
        if(first==n&&res.indexOf(solutionee)==-1) res.add(new ArrayList(output));
        for(int i=first;i<n;i++){
            Collections.swap(output,first,i);
            backtrack(n,output,res,first+1);
            //撤销，回溯操作。
            Collections.swap(output,first,i);
        }
    }
}
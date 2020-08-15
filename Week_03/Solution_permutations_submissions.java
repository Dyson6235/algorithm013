import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution_permutations_submissions {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList();
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int num:nums){
            output.add(num);
        }

        int n = nums.length;
        backtrack(n,output,res,0);
        return res;
    }


    public void backtrack(int n,ArrayList<Integer> output,
                          List<List<Integer>> res,
                          int first){
        if(first==n)
            res.add(new ArrayList<Integer>(output));
        for(int i=first;i<n;i++){
            Collections.swap(output,first,i);
            backtrack(n,output,res,first+1);
            //撤销，回溯操作。
            Collections.swap(output,first,i);
        }
    }

}
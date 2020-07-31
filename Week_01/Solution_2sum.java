public class Solution_2sum {
    public int[] twoSum(int[] nums, int target) {
        int[] sl = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sl[0]=i;
                    sl[1]=j;
                    return sl;
                }
            }
        }
        return sl;
    }
}

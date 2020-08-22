package Solution;

class SolutionForJumpGame {
    public boolean canJump(int[] nums) {
        if(nums==null) return false;
        int canReachable = nums.length -1;
        //贪心算法，从后往前贪心。
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=canReachable) canReachable =i;
        }
        return canReachable==0;
    }
}
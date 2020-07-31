public class Solution_trapping_rain_water {
    public int trap(int[] height) {
        int[] l = new int[height.length];
        int max = -1;
        int totalWater = 0;
        for(int i=0; i<height.length;i++){
            max=Math.max(max, height[i]);
            l[i] = max;
        }
        max = -1;
        for(int i=height.length-1; i>=0;i--){
            max=Math.max(max,height[i]);
            totalWater+= Math.min(l[i], max) - height[i];

        }
        return totalWater;

    }
}

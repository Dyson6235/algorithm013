package Solution;

public class SolutionForLemonadeChange {
    //贪心算法
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;//20块钱找不开
        for (int bill: bills) {
            //分为3种情况5、10、20
            if (bill == 5)
                five++;
            else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

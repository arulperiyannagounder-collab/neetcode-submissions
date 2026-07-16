/*class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length!=0){
        int count =1;
        int n = nums.length;
        TreeSet <Integer> set = new TreeSet<> ();
        for ( int val: nums){ set.add(val);}
                for (int i :set ){
            if ( set .contains(i+1)) count ++;
            
        } return count;
    }return 0;}
}*/

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        return res;
    }
}



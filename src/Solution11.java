import java.util.HashSet;

class Solution11 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0 ;i<nums.length; i++)set.add(nums[i]);
        if(set.size()>nums.length/2)answer=nums.length/2;
        else answer=set.size();

        return answer;
    }
}
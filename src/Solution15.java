class Solution15 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(minority(nums[i]+nums[j]+nums[k])>0){answer++;
                    System.out.println(i+" "+j+" "+k+"\n");}
                }
            }
        }

        return answer;
    }
    public int minority(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0)return -1;
        }
        return 1;
    }
}
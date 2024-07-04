class Solution12 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            if(decimal(i)>limit)answer+=power;
            else answer+=decimal(i);
        }
        return answer;
    }
    public int decimal(int num){
        int cnt=0;
        for(int i=0; i<num; i++){
            if(num%(i+1)==0)cnt++;
        }
        return cnt;
    }
}
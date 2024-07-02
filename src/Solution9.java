class Solution9 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        answer="Yes";
        int cnt_g=0;
        int cnt1=0;
        int cnt2=0;
        while(cnt_g<goal.length){
            if(goal[cnt_g].equals(cards1[cnt1])){
                if(cnt1+1< cards1.length)cnt1++;
                cnt_g++;
            }else if(goal[cnt_g].equals(cards2[cnt2])){
                if(cnt2+1< cards2.length)cnt2++;
                cnt_g++;
            }else{
                answer="No";
                break;
            }
        }
        return answer;
    }
}
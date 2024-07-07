class Solution19 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int min=0, max=0;
        int best, worst;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0)max++;
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j])min++;
            }
        }
        max+=min;
        switch(min){
            case 6:
                worst=1;
                break;
            case 5:
                worst=2;
                break;
            case 4:
                worst=3;
                break;
            case 3:
                worst=4;
                break;
            case 2:
                worst=5;
                break;
            default:
                worst=6;
                break;
        }
        switch(max){
            case 6:
                best=1;
                break;
            case 5:
                best=2;
                break;
            case 4:
                best=3;
                break;
            case 3:
                best=4;
                break;
            case 2:
                best=5;
                break;
            default:
                best=6;
                break;
        }
        answer[0]=best;
        answer[1]=worst;
        return answer;
    }
}
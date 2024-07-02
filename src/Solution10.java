class Solution10 {
    //31,29,31,30,31,30,31,31,30,31,30,31
    public String solution(int a, int b) {
        String answer = "";
        int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] month2={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int total=0;
        for(int i=0; i<a-1; i++){
            total+=month[i];
        }
        total+=b;
        int jump=(total-1)%7;
        answer=month2[jump];
        return answer;
    }
}
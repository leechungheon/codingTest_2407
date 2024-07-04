class Solution16 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i=0;
        while(true){
            int j;
            int cnt=0;
            j=i;
            answer++;
            if(section[i]+(m-1)>=n || section[i]+m-1>=section[section.length-1])break;
            while(section[i]+(m-1)>=section[j+1]){
                j++;
                cnt++;
            }

            if (cnt != 0) {
                i += j;
            }
            i++;
        }
        return answer;
    }
}
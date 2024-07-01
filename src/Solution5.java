import java.util.*;

class Solution5 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
        }
        list.sort(Comparator.reverseOrder());
        int n=m-1;
        for(int j=0; j<score.length/m; j++){//상자 개수 만큼 반복
            answer += list.get(n) * m;
            n += m;
        }
        return answer;
    }
}
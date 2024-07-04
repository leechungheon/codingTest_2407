import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution14 {
    //사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
        }
        Collections.sort(list,Collections.reverseOrder());//내림차순

        int box = (score.length) / m;
        int j=m-1;
        for(int i=0; i<box; i++){
            answer+=list.get(j)*m;
            j+=m;
        }


        return answer;
    }
}
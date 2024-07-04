import java.util.ArrayList;
import java.util.List;

class Solution13 {
    public int[] solution(int[] answers) {

        int[] a={1, 2, 3, 4, 5};
        int[] b={2, 1, 2, 3, 2, 4, 2, 5};
        int[] c={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int ascore=0, bscore=0, cscore=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i % a.length]) ascore++;
            if(answers[i] == b[i % b.length]) bscore++;
            if(answers[i] == c[i % c.length]) cscore++;
        }
        int j=0;
        int MaxScore=Math.max(ascore, Math.max(bscore,cscore));
        List<Integer> topScore= new ArrayList<>();
        if(ascore==MaxScore){
            topScore.add(1);
        }
        if(bscore==MaxScore){
            topScore.add(2);
        }
        if(cscore==MaxScore){
            topScore.add(3);
        }
        int[] answer = new int[topScore.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=topScore.get(i);
        }

    return answer;}
}
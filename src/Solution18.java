import java.util.*;

class Solution18 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Stage> list= new ArrayList<>();
        for(int i=1; i<=N; i++){
            list.add(new Stage(i,fail(i,stages)));
        }
        Collections.sort(list,Collections.reverseOrder());

        for(int i=0; i<N; i++) {
            answer[i]=list.get(i).stage;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        int stage;
        double failure;

        public Stage(int stage, double failure) {
            this.stage = stage;
            this.failure = failure;
        }

        @Override
        public int compareTo(Stage other) {
            if(other.failure!=this.failure)return Double.compare(this.failure, other.failure);
            else{
                return Integer.compare(other.stage, this.stage);
            }
        }
    }

    public double fail(int n, int[] stages) {
        int mother=0;//분모
        int son=0;//분자
        for (int i = 0; i < stages.length; i++) {
            if(n<=stages[i])mother++;
            if(n==stages[i])son++;
        }
        if (mother == 0) return 0; // Avoid division by zero
        return (double) son /mother;
    }
}
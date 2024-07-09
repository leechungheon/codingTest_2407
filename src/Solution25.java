import java.util.LinkedList;
import java.util.Queue;

class Solution25 {
    public int solution(String s) {
        int answer = 0;


        char[] array=s.toCharArray();
        Queue<Character> q = new LinkedList<>();
        for(char c:array)q.add(c);

        while(!q.isEmpty()) {
            int start=1;
            int other=0;
            char first=q.poll();

            while(true){
                if(!q.isEmpty() && q.peek()==first) {
                    q.poll();
                    start++;
                }
                else if (!q.isEmpty() && q.peek()!=first){
                    q.poll();
                    other++;
                }
                if(start==other || q.isEmpty()){
                    answer++;
                    break;
                }
            }

        }
        return answer;
    }
}
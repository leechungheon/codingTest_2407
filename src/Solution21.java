import java.util.LinkedList;
import java.util.Queue;
// "aya", "ye", "woo", "ma" 만 가능하고 단어가 연속되면 불가능하다. 가능한 총 답은 ?
class Solution21{
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++) {
            boolean check=false;
            char[] array_check=new char[30];
            array_check[0]='k';
            int j=1;

            Queue<Character> q = new LinkedList<>();
            char[] array=babbling[i].toCharArray();
            for(char element:array)q.add(element);
            do{
                if (!q.isEmpty() && q.peek() == 'a') {
                    check = a_start(q);
                    array_check[j] = 'a';  // 현재 단어의 시작 문자 기록
                } else if (!q.isEmpty() && q.peek() == 'y') {
                    check = y_start(q);
                    array_check[j] = 'y';  // 현재 단어의 시작 문자 기록
                } else if (!q.isEmpty() && q.peek() == 'w') {
                    check = w_start(q);
                    array_check[j] = 'w';  // 현재 단어의 시작 문자 기록
                } else if (!q.isEmpty() && q.peek() == 'm') {
                    check = m_start(q);
                    array_check[j] = 'm';  // 현재 단어의 시작 문자 기록
                } else {
                    break;  // 더 이상 매칭되는 단어가 없을 때 루프 종료
                }
                if(array_check[j]==array_check[j-1])check=false;
                j++;

            }while(!q.isEmpty() && check);

            if(q.isEmpty() && check)answer++;
        }

        return answer;
    }
    public boolean a_start(Queue<Character> q){
        if(!q.isEmpty() && q.peek()=='a'){
            q.poll();        //a제거
            if(!q.isEmpty() && q.peek()=='y'){
                q.poll();    //y제거
                if(!q.isEmpty() && q.peek()=='a'){
                    q.poll();//a제거
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public boolean y_start(Queue<Character> q){
        if(!q.isEmpty() && q.peek()=='y'){
            q.poll();
            if(!q.isEmpty() && q.peek()=='e'){
                q.poll();
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public boolean w_start(Queue<Character> q){
        if(!q.isEmpty() && q.peek()=='w'){
            q.poll();
            if(!q.isEmpty() && q.peek()=='o'){
                q.poll();
                if(!q.isEmpty() && q.peek()=='o'){
                    q.poll();
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public boolean m_start(Queue<Character> q){
        if(!q.isEmpty() && q.peek()=='m'){
            q.poll();
            if(!q.isEmpty() && q.peek()=='a'){
                q.poll();
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
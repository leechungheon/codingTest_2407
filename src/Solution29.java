import java.util.LinkedList;
import java.util.List;

class Solution29 {
    //1, 2, 3 중 하나의 값이며, 순서대로 빵(1), 야채(2), 고기(3)
    //따라서 하나의 햄버거는 1,2,3,1 의 순서가 되어야 함.
    int answer = 0;
    public int solution(int[] ingredient) {

        List list=new LinkedList();
        for(int i:ingredient)list.add(i);
        count(list);
        return answer;
    }
    public void count(List list){
        for(int i=0; i<list.size()-3; i++){
            if((Integer)list.get(i)==1 && (Integer)list.get(i+1)==2 && (Integer)list.get(i+2)==3 && (Integer)list.get(i+3)==1){
                list.remove(i);list.remove(i);list.remove(i);list.remove(i);
                answer++;
                count(list);
            }
        }
    }

}
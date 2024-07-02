import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution7 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list=Arrays.asList(strings);
        Collections.sort(list);
        // Bubble Sort를 사용하여 n번째 문자열을 기준으로 정렬
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length-1-i; j++) {
                char a = list.get(j).charAt(n);
                char b = list.get(j + 1).charAt(n);
                if (a > b) {
                    swap(list, j);
                }
            }
        }
        //list의 요소를 answer에 저장
        answer = list.toArray(new String[0]);
        return answer;
    }
    public void swap(List<String> list, int i){
        String temp=list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,temp);
    }
}
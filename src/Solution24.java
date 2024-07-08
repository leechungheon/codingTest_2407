import java.util.LinkedList;
import java.util.List;

class Solution24 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] skipArray=skip.toCharArray();
        char[] sArray=s.toCharArray();
        List<Character> list=new LinkedList<>();

        for(int i=0; i<alphabet.length; i++){
            list.add(alphabet[i]);
        }
        for(int i=0; i<skipArray.length; i++){
            list.remove(Character.valueOf(skipArray[i]));
        }
        for(int i=0; i<sArray.length; i++){
            int n=list.indexOf((sArray[i]));
            char c=list.get((n+index)%list.size());
            sArray[i]=c;
        }
        for (char c : sArray) {
            answer += c;
        }

        return answer;
    }
}
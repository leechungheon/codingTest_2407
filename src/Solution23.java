import java.util.HashMap;
import java.util.Map;
//keymap	            targets     	result
//["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
class Solution23 {
    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];
        Map<Character, Integer> map= new HashMap<>();

        for(int i=0; i<keymap.length; i++){

            char[] array=keymap[i].toCharArray();

            for(int j=0; j<array.length; j++){

                if(!map.containsKey(array[j]) || map.get(array[j]) > j + 1)map.put(array[j], j+1);

            }
        }
        for(int i=0; i<targets.length; i++){
            char[] array=targets[i].toCharArray();
            for(int j=0; j<array.length; j++){
                if (map.containsKey(array[j])) {
                    answer[i] += map.get(array[j]);
                } else {
                    // 만약 맵에 키가 없으면 -1을 저장하거나 다른 방식으로 처리할 수 있습니다.
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
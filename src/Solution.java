import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int i=0;
        Set set = new HashSet();
        Collections.addAll(set, report);
        String[] reports=new String[set.size()];
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            reports[i]=element;
            i++;
        }

        Map<String, Integer> map=new HashMap(); // 사용자들의 신고된 횟수
        for (String item : reports) {
            String[] s;
            s = item.split(" ");
            if (map.get(s[1]) != null) {
                map.put(s[1], map.get(s[1]) + 1);
            } else {
                map.put(s[1], 1);
            }
        }
        List banlist=new ArrayList(); // 정지 사용자 리스트
        for (String value : id_list) {
            if (map.get(value) != null && map.get(value) >= k) {
                banlist.add(value);
            }
        }
        Map<String, Integer> count=new HashMap<>(); // 결과 메일 횟수
        for (String string : reports) {
            for (Object o : banlist) {
                String[] s = string.split(" ");
                if (s[1].equals(o)) {
                    if (count.get(s[0]) == null) {
                        count.put(s[0], 1);
                    } else {
                        count.put(s[0], count.get(s[0]) + 1);
                    }
                }
            }
        }
        for(int n=0; n<id_list.length; n++){
            if(count.get(id_list[n])==null){
                answer[n]+=0;
            }else{
                answer[n]+=count.get(id_list[n]);
            }
        }

        return answer;
    }
}
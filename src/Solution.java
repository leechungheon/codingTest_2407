import java.util.*;
public class Solution{
    static class Search{
        char[][]array;
        boolean[][]visited;
        int total=0;

        public Search(char[][] array){
            this.array=array;
            this.visited=new boolean[array.length][array[0].length];
        }
        public int start(int i, int j){
            if(array[i][j]=='X'||visited[i][j])return 0;
            visited[i][j]=true;
            total+=Character.getNumericValue(array[i][j]);

            //오른쪽
            if(j+1<array[i].length){
                start(i,j+1);
            }
            //아래쪽
            if(i+1<array.length){
                start(i+1, j);
            }
            //왼쪽
            if(j-1>=0){
                start(i,j-1);
            }
            //위쪽
            if(i-1>=0){
                start(i-1,j);
            }
            return total;
        }
    }
    public int[] solution(String[] maps){
        char[][] twoDimensionalArray=new char[maps.length][];
        for(int i=0; i<maps.length; i++){
            twoDimensionalArray[i]=maps[i].toCharArray();
        }
        List<Integer> results=new ArrayList<>();
        Search search = new Search(twoDimensionalArray);

        //모든 시작점에 대해 탐색 실행
        for(int i=0; i<twoDimensionalArray.length; i++){
            for(int j=0; j<twoDimensionalArray[i].length; j++){
                int result=search.start(i,j);
                if(result!=0)results.add(result);
                search.total=0;
            }
        }
        //정렬-오름차순
        Collections.sort(results);

        //결과 배열 생성 및 반환
        int[] answer=new int[results.size()];
        for(int k=0; k<results.size(); k++){
            answer[k]=results.get(k);
        }
        if(answer.length==0){
            answer=new int[]{-1};//무인도가 없는 경우 -1
        }
        return answer;
    }
}
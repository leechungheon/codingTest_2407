class Solution6 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        for(int i=0; i<callings.length; i++){
            for(int j=0; j<players.length; j++){
                if(callings[i].equals(players[j])){
                    swap(players,j);
                }
            }
        }
        answer=players;
        return answer;
    }
    public void swap(String[] players, int j){
        String temp;
        temp=players[j];
        players[j]=players[j-1];
        players[j-1]=temp;
    }
}
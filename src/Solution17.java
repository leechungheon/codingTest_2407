class Solution17 {
    public int solution(int n) {
        int answer = 0;
        if(n>=2)answer++;
        for(int i=3; i<=n; i++)answer+=minoirty(i);
        return answer;
    }
    public int minoirty(int n) {
        if(n%2==0)return 0;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n%i==0&&i!=n)return 0;
        }
        return 1;
    }
}
class Main{
    public static void main(String[] args) {
        String[] parks={"muzi", "frodo", "apeach", "neo"};
        String[] routes={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        Solution sol=new Solution();
        sol.solution(parks, routes,2);
    }
}
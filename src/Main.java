class Main{
    public static void main(String[] args) {
        String today="2022.05.19";
        String[] terms={"A 6", "B 12", "C 3"};
        String[] privacies={"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        Solution sol=new Solution();
        sol.solution(today,terms,privacies);

    }
}
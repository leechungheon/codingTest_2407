class Main{
    public static void main(String[] args) {
        int[] stages={2, 1, 2, 6, 2, 4, 3, 3};
        int[] win_nums={31, 10, 45, 1, 6, 19};
        int[] lottos={44, 1, 0, 0, 31, 25};
        Solution sol=new Solution();
        sol.solution(lottos,win_nums);
    }
}
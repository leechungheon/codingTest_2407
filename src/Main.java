class Main{
    public static void main(String[] args) {
        int[] stages={2, 1, 2, 6, 2, 4, 3, 3};
        int[] win_nums={31, 10, 45, 1, 6, 19};
        int[] lottos={44, 1, 0, 0, 31, 25};
        String dartResult="10T#1T*2D*";
        Solution sol=new Solution();
        System.out.println(sol.solution(dartResult));
    }
}
class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 예제 데이터
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        // 솔루션 메서드 호출 및 결과 출력
        int result = sol.solution(board, moves);
        System.out.println("Result: " + result); // 예상 결과: 4
    }

}
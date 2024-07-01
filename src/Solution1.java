import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution1 {
    public static class Node{
        int x;
        int y;
        int idx;
        Node left;
        Node right;

        Node(int x, int y, int idx){
            this.x = x;
            this.y = y;
            this.idx = idx;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree{
        Node root = null;

        public BinaryTree() {}

        public void insert(int x, int y, int idx) {
            if(root != null) { //루트 노드가 있으면
                Node head = root; //head는 root
                Node cNode;

                while(true) {
                    cNode = head;
                    if(x < cNode.x) {
                        if(cNode.left != null) head = cNode.left;
                        else {
                            cNode.left = new Node(x, y, idx);
                            break;
                        }
                    }
                    else {
                        if(cNode.right != null) head = cNode.right;
                        else {
                            cNode.right = new Node(x, y, idx);
                            break;
                        }
                    }
                }
            }
            //루트노드가 없으면
            else root = new Node(x, y, idx);
        }
        public void preorder(Node n, ArrayList<Integer> list) { //전위순회
            list.add(n.idx);
            if(n.left != null) preorder(n.left, list);
            if(n.right != null) preorder(n.right, list);
        }

        public void postorder(Node n, ArrayList<Integer> list) { //후위순회
            if(n.left != null) postorder(n.left, list);
            if(n.right != null) postorder(n.right, list);
            list.add(n.idx);
        }
    }

    public static int[][] solution(int[][] nodeinfo) {
        int len = nodeinfo.length;
        int[][] answer = new int[2][len], infos = new int[len][3];

        for(int idx = 0; idx < len; ++idx) {
            infos[idx][0] = nodeinfo[idx][0];
            infos[idx][1] = nodeinfo[idx][1];
            infos[idx][2] = idx + 1;
        }

        Arrays.sort(infos, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o2[1] - o1[1];
            };
        });

        BinaryTree binary = new BinaryTree();
        for(int idx = 0; idx < len; ++idx) binary.insert(infos[idx][0], infos[idx][1], infos[idx][2]);
        ArrayList<Integer> pre = new ArrayList<>();
        binary.preorder(binary.root, pre);
        ArrayList<Integer> post = new ArrayList<>();
        binary.postorder(binary.root, post);

        for(int idx = 0; idx < len; ++idx) {
            answer[0][idx] = pre.get(idx);
            answer[1][idx] = post.get(idx);
        }
        return answer;
    }
}

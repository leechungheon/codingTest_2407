import java.util.Stack;
//"10T#1T*2D*"
class Solution20 {
    public int solution(String dartResult) {
        int answer = 0;
        char[] array=dartResult.toCharArray();
        Stack<Character>stack=new Stack<>(); // 모두 char 배열로 바꾸어 stack에 저장
        Stack<Integer>n_stack=new Stack<>(); // 숫자는 n_stack에 따로 저장 (계산 용도)
        for (char c : array) {
            stack.push(c);
        }
        for(int i = 0; i < array.length; i++){

            if(nubmerCheck(array[i])){//숫자라면
                if(i==0)n_stack.push(Character.getNumericValue(array[i]));
                else if(array[i-1]!='1'){
                    n_stack.push(Character.getNumericValue(array[i]));
                }
                else if(array[i-1]=='1' && array[i]=='0'){
                    n_stack.pop();
                    n_stack.push(10);
                }

            }else if(alphaCheck(array[i])){//S D T 라면

                if(array[i]=='S'){
                    //1승
                }
                if(array[i]=='D'){
                    int n=n_stack.pop();
                    n=n*n;
                    n_stack.push(n);
                }
                if(array[i]=='T'){
                    int n=n_stack.pop();
                    n=n*n*n;
                    n_stack.push(n);
                }
            }
            else{
                if(array[i]=='*'){
                    int n=n_stack.pop();
                    n=n*2;

                    if(!n_stack.isEmpty()){
                        int m=n_stack.pop();
                        m=m*2;
                        n_stack.push(m);
                        n_stack.push(n);
                    }else{
                        n_stack.push(n);
                    }

                }
                if(array[i]=='#'){
                    int n=n_stack.pop();
                    n=n*-1;
                    n_stack.push(n);
                }
            }
        }
        while(!n_stack.isEmpty())answer+=n_stack.pop();
        return answer;
    }
    public boolean nubmerCheck(char n){
        if(n=='0'||n=='1'||n=='2'||n=='3'||n=='4'||n=='5'||n=='6'||n=='7'||n=='8'||n=='9')return true;
        else{
            return false;
        }
    }
    public boolean alphaCheck(char n){
        if(n=='S'||n=='D'||n=='T')return true;
        else{
            return false;
        }
    }
}
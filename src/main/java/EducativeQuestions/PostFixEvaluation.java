package EducativeQuestions;

public class PostFixEvaluation {

//    2 * 1 = 2,
//2nd operation => 9 - 2 = 7,
//3rd operation => 7 - 8 = -1,
//4th operation => -1 + 4 = 3
    public static int evaluatePostFix(String expression) {
        Stack<Integer> result=new Stack<>(expression.length());
        for(int i =0 ;i<expression.length();i++){
            char ch=expression.charAt(i);
            switch (ch){
                case '+':
                    if(result.getCurrentSize()>=2){
                        int num1=result.pop();
                        int num2=result.pop();
                        result.push(num2+num1);
                    }
                    break;
                case '-':
                    if(result.getCurrentSize()>=2){
                        int num1=result.pop();
                        int num2=result.pop();
                        result.push(num2-num1);
                    }
                    break;
                case '*':
                    if(result.getCurrentSize()>=2){
                        int num1=result.pop();
                        int num2=result.pop();
                        result.push(num2*num1);
                    }
                    break;
                case '/':
                    if(result.getCurrentSize()>=2){
                        int num1=result.pop();
                        int num2=result.pop();
                        result.push(num2/num1);
                    }
                    break;
                default:
                    result.push(Integer.parseInt(String.valueOf(ch)));
            }
        }
        if(!result.isEmpty())
            return result.pop();

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {

        String input="921*-8-4+";
        int result=evaluatePostFix(input);
        System.out.println(result);
    }
}

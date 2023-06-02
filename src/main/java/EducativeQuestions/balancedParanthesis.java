package EducativeQuestions;

public class balancedParanthesis {

    public static boolean isBalanced(String exp) {
        Stack<Character> temp=new Stack<>(exp.length());


        for(int i =0 ;i<exp.length();i++){
            Character operator=exp.charAt(i);
            if( operator=='}' || operator==']' ||operator==')'){
                if(temp.isEmpty())
                    return false;

                if((operator=='}' && temp.pop()!='{') || (operator==']' && temp.pop()!='[') || (operator==')' && temp.pop()!='('))
                    return false;
            }
            else{
                temp.push(operator);
            }

        }
        if(!temp.isEmpty())
            return false;

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("[{(}]"));
    }
}

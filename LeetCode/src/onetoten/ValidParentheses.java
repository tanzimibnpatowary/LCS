package onetoten;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
        char[] myArray = s.toCharArray();
        Stack<Character> myStack = new Stack<Character>();
        for(int i = 0; i < myArray.length; i++){
        	if (!myStack.isEmpty() && myStack.peek()=='(' && myArray[i]==')'
        			||!myStack.isEmpty() && myStack.peek()=='{' && myArray[i]=='}'
        			||!myStack.isEmpty() && myStack.peek()=='[' && myArray[i]==']') {
        		myStack.pop();
			}else {
				myStack.push(myArray[i]);
			}
        }
        if (!myStack.empty()) {
			return false;
		}else {
			return true;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "()[]";
		System.out.println(isValid(myString));
	}

}

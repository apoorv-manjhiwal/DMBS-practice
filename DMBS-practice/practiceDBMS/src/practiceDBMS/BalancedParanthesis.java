package practiceDBMS;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		String result = "{[]} () [{}]";
		Object input = null;
		boolean result1 = isParenthesisBalanced(input);
		if(result1) {
			System.out.println("the entered String has balanced brackets");
		} else {
			System.out.println("the entered strings  do not have balanced brackets");
		}
		
	}
	
	private static boolean isParenthesisBalanced(Object input) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isParanthesisisBalanaced (String input) {
		Stack<Character> stack = new Stack<Character>();
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == '(' || inputArray[i] == '[' || inputArray[i] == '{' ) {
				stack.push(inputArray[i]);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char c;
			switch(inputArray[i]) {
			case ')':
				 c = stack.pop();
				if (c == ']' || c == '}') {
					return false;
				}
				break;
			case ']':
				 c = stack.pop();
				if (c == ')' || c == '}') {
					return false;
				}
				break;
			case '}':
				 c = stack.pop();
				if (c == ']' || c == ')') {
					return false;
				}
				break;
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}

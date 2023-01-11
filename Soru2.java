import java.util.Stack;

public class Soru2 {
	public static void main(String args[]) {
		//f1("abddbcca");
		f1("eaccggabffbe");
	}

	
	public static void f1(String pattern) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<pattern.length();i++) {
			if(stack.isEmpty()) {
				stack.add(pattern.charAt(i));
				f2(pattern.charAt(i),stack.size());
				continue;
			}
			
			char c=stack.peek();
			if(pattern.charAt(i)==c) {
				stack.pop();
			}
			else {
				stack.add(pattern.charAt(i));
				f2(pattern.charAt(i),stack.size());
			}
		}
	}
	
	public static void f2(Character c,int size) {
		String tire="";
		for(int i=0;i<size-1;i++) {
			tire+="-";
		}
		System.out.println(tire+c);
	}
}

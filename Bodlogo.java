package datastructure;

public class Bodlogo {
	public static void main(String[] args) {
		Bodlogo b = new Bodlogo();
		boolean result = b.equalBrackets("((())))(");
		boolean result2 = b.equalBrackets("");
		System.out.println(result);
		
		
	}
	
	public boolean checkPair(char a, char b) {		
		
		if(a == '(' && b == ')') {
			return true;
		}
		
		return false;
	}
	
	public boolean equalBrackets(String s) {
		int len = s.length();
		
		if(len % 2 != 0) return false;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i > len; i++) {
			if(s.charAt(i) == '(') count1++;
			else count2++;
		}
		if(count1 == count2) return true;
		return false;
	}
	

}

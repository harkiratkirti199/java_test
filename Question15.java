package io.pragra.learning;

public class Question15 {

	public static void main(String args[]) {
		String str="harkiratsingh";
		
		System.out.println(countOccurences(str,'h'));
		
	}
	
	public static int countOccurences(String s, char c) {
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(c==(s.charAt(i)))
					count ++;
		}
		
		return count;
	}

}

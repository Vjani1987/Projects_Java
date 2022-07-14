package com.BasicNew;

public class String_5 {
	
	public static void main(String[] args) {
		
		String[] names= { "Vanitha","Santhosh","Jithu"};
		
		private void joinWords(String[] names) {
			
			StringBuffer sb= new StringBuffer();
			
			sb.joinWords();
		}
			
			String sentence=" ";
			
			for(String words: names) {
				
				sb.append(words);
				
				sentence= sentence+words;
				
				System.out.println(sentence);
				
				System.out.println(sb);
			}
		}
	}



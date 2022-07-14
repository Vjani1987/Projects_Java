package com.BasicNew;

public class String_3 {
	
	public static void main(String[] args) {
		
		String word= "madam";
		String name="";
		
		for(int i= word.length()-1;i>=0;i--)
		{
			name= name+word.charAt(i);
			System.out.println(name);
		}
		if(name.equals(word))
		{
		System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");	
	}

}

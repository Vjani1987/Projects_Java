package com.BasicNew;

public class String_4 {
	
	public static void main(String[] args) {
		
		String angel="Vanitha";
		
		//angel.charAt(3);
		System.out.println(angel.charAt(3));
		
		System.out.println(angel.length());
		
		System.out.println(angel.equals("vanitha"));
		
		System.out.println(angel.equalsIgnoreCase("vanitha"));
		
		System.out.println(angel.contains("Vanitha"));
		
		System.out.println(angel.isEmpty());
		
		System.out.println(angel.toUpperCase());
		
		System.out.println(angel.toLowerCase());
		
		System.out.println(angel.substring(1));
		
		System.out.println(angel.substring(0,4));
		
		System.out.println(angel.lastIndexOf('a'));
		
		System.out.println(String.join("/","25", "08","1987"));
		
		String []name= {"Aadith", "Jithu","santhosh"};
		
		for(String word: name)
		{
			System.out.println(word);
		
		}
		String name1="beautycutie";
		System.out.println(name1.split());
		
	}
				
		
		
		
		
	}

}

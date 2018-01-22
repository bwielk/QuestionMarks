package questionmarks;

import java.util.ArrayList;

public class QuestionMarksChecker {
	
	private boolean result = false;
	
	public boolean run(String s){
		ArrayList<String> characters = new ArrayList<String>();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		//populates the numbers array
		char[] numbers = new char[10];
		for(int i = 0; i<10; i++){
			numbers[i] = (char)(i + '0'); 
		}
		//Extracts numbers from the String and gets their index
		char[] chars = s.toCharArray();
		for(int i = 0; i< chars.length; i++){
			char ch = chars[i];
			for(int n = 0; n<numbers.length; n++){
				if(ch == numbers[n]){
					characters.add(String.valueOf(ch));
					indexes.add(Integer.valueOf(i));
				}
			}
		}
		//Checks if any of pairs is equal to 10
		//Checks if there are 3 question marks between the pair of numbers equal to 10
		return result;
	}

}

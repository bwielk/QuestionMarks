package questionmarks;

import java.util.ArrayList;

public class QuestionMarksChecker {
	
	private boolean result = false;
	ArrayList<String> characters = new ArrayList<String>();
	ArrayList<Integer> indexes = new ArrayList<Integer>();
	
	public boolean run(String s){
		char[] numbers = createArrayOfDigits(10);
		char[] chars = s.toCharArray();
		findNumbers(chars, numbers);
		return checkForQuestionMarks(chars);
	}
	
	public char[] createArrayOfDigits(int limit){
		if(limit <= 10){
			char[] numbers = new char[limit];
			for(int i = 0; i<10; i++){
				numbers[i] = (char)(i + '0'); 
				return numbers;
			}
		}
		return null;
	}
	
	public void findNumbers(char[] chars, char[] numbers){
		for(int i = 0; i< chars.length; i++){
			char ch = chars[i];
			for(int n = 0; n<numbers.length; n++){
				if(ch == numbers[n]){
					characters.add(String.valueOf(ch));
					indexes.add(Integer.valueOf(i));
				}
			}
		}
	}
	
	public boolean checkForQuestionMarks(char[] stringToSearchIn){
		boolean result = true;
		for(int i = 0; i<characters.size(); i++){
			if(Integer.valueOf(characters.get(i)) + Integer.valueOf(characters.get(i)) == 10){
				int count = 0;
				for(int x = indexes.get(i); x<indexes.get(i+1); x++){
					if(stringToSearchIn[x] == '?'){
						count ++;
					}
				}
				if(count == 3){
					result =  true;
				}else{
					result =  false;
				}
			}
		}
		return result;
	}
}
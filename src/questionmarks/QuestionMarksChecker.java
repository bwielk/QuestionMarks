package questionmarks;

import java.util.ArrayList;

public class QuestionMarksChecker {
	
	private boolean result = false;
	private ArrayList<String> characters = new ArrayList<String>();
	private ArrayList<Integer> indexes = new ArrayList<Integer>();

	public boolean run(String s){
		String[] numbers = createArrayOfDigits();
		String[] chars = new String[s.length()];
		for(int i=0; i<s.length(); i++){
			chars[i] = String.valueOf(s.charAt(i));
		}
		findNumbers(chars, numbers);
		System.out.println(characters);
		System.out.println(indexes);
		checkForQuestionMarks(chars);
		return result;
	}
	
	public String[] createArrayOfDigits(){
		String[] numbers = new String[10];
		for(int i = 0; i<10; i++){
			numbers[i] = String.valueOf(i);
		}
		return numbers;
	}
	
	public void findNumbers(String[] chars, String[] numbers){
		for(int i = 0; i<chars.length; i++){
			String ch = chars[i];
			for(int n = 0; n<numbers.length; n++){
				if(ch.equals(numbers[n])){
					characters.add(ch);
					indexes.add(Integer.valueOf(i));
				}
			}
		}
	}
	
	public void checkForQuestionMarks(String[] stringToSearchIn){
		String questionMark = "?";
		int count = 0;
		for(int i = 0; i<characters.size()-1; i++){
			if(Integer.valueOf(characters.get(i)) + Integer.valueOf(characters.get(i+1)) == 10){
				System.out.println(Integer.valueOf(characters.get(i)) + Integer.valueOf(characters.get(i+1)));
				for(int x = indexes.get(i); x<indexes.get(i+1); x++){
					if(stringToSearchIn[x].equals(questionMark)){
						count ++;
					}
				}
			}
		}
		System.out.println("count : " + count);
		if(count == 3){
			result = true;
		}
	}
}
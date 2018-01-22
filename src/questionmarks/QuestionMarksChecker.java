package questionmarks;

public class QuestionMarksChecker {
	
	private boolean result = false;
	
	public boolean run(String s){
		char[] numbers = new char[10];
		for(int i = 0; i<10; i++){
			numbers[0] = (char)i; 
		}
		System.out.println(numbers[0]);
		char[] pieces = new char[2];
		char[] chars = s.toCharArray();
		for(int i = 0; i< chars.length; i++){
			char ch = chars[i];
		//	if()
		}
		return result;
	}

}

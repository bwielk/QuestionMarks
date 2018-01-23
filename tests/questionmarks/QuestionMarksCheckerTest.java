package questionmarks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionMarksCheckerTest {

	private QuestionMarksChecker checker;
	private String string1;
	private String string2;
	
	@Before
	public void before(){
		checker = new QuestionMarksChecker();
		string1 = new String("7s??b?3dddd7");
		string2 = new String("1sf2d??daaa?2d23");
	}
	
	/*@Test
	public void checkerFindsQuestionMarksBetweenNumbersOFSum10() {
		assertEquals(true, checker.run(string1));
		assertEquals(false, checker.run(string2));
	}*/
	
	@Test
	public void checkerPopulatersCharactersWithNumbers(){
		checker.run(string1);
		assertEquals("7", checker.getCharacters().get(0));
	}
	
	

}

package questionmarks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionMarksCheckerTest {

	private QuestionMarksChecker checker;
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;
	
	@Before
	public void before(){
		checker = new QuestionMarksChecker();
		string1 = new String("7s??b?3dddd7");//true
		string2 = new String("1sf2d??daaa?2d23");//false
		string3 = new String("4fjjj???jjj6j4");//true
		string4 = new String("1mmnd2???23iij2");//false
		string5 = new String("9???1");//true
		string6 = new String("1234???pp5");//false
	}
	
	@Test
	public void checkerFindsQuestionMarksBetweenNumbersOFSum10() {
		assertEquals(true, checker.run(string1));
		assertEquals(true, checker.run(string3));
		assertEquals(true, checker.run(string5));
	}
	
	@Test
	public void checkerPopulatersCharactersWithNumbers(){
		checker.run(string1);
		assertEquals("7", checker.getCharacters().get(0));
	}
}

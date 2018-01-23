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
		string2 = new String("1sf2d??daaa?8d23");//false
		string3 = new String("4fjjj???jjj6j4");//true
		string4 = new String("1mmnd2???83iij2");//false
		string5 = new String("9???1");//true
		string6 = new String("1234???pp6");//false
	}
	
	@Test
	public void checkerReturnsTrueIfThereAre3xQuestionsMarksBetweenNumbersOfSum10() {
		assertEquals(true, checker.run(string1));
		assertEquals(true, checker.run(string2));
		assertEquals(true, checker.run(string3));
		assertEquals(true, checker.run(string4));
		assertEquals(true, checker.run(string5));
		assertEquals(true, checker.run(string6));
	}
	
	@Test
	public void checkerReturnsFalseIfThereAreNot3xQuestionsMarksBetweenNumbersOfSum10(){
		assertEquals(false, checker.run(new String("fddgd4??6d")));
		assertEquals(false, checker.run(new String("1?4d8a??f2c")));
		assertEquals(false, checker.run(new String("ifg9?w1dd")));
	}
	
	@Test
	public void checkerReturnsFalseIfThereAre3xQuestionsMarksBetweenNumbersOfSumLessThan10(){
		assertEquals(false, checker.run(new String("1?4d8?a??f1c")));
		assertEquals(false, checker.run(new String("bv6cdw?ad?sd?2")));
		assertEquals(false, checker.run(new String("4???cvv1")));
		assertEquals(false, checker.run(new String("1xfserysytdyu???dvdfsd8")));
	}
}

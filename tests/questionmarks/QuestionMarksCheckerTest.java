package questionmarks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionMarksCheckerTest {

	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String string6;
	
	@Before
	public void before(){
		string1 = new String("7s??b?3dddd7");//true
		string2 = new String("1sf2d??daaa?8d23");//false
		string3 = new String("4fjjj???jjj6j4");//true
		string4 = new String("1mmnd2???83iij2");//false
		string5 = new String("9???1");//true
		string6 = new String("1234???pp6");//false
	}
	
	@Test
	public void checkerReturnsTrueIfThereAre3xQuestionsMarksBetweenNumbersOfSum10() {
		assertEquals(true, new QuestionMarksChecker().run(string1));
		assertEquals(true, new QuestionMarksChecker().run(new String("11???9")));
		assertEquals(true, new QuestionMarksChecker().run(string2));
		assertEquals(true, new QuestionMarksChecker().run(string3));
		assertEquals(true, new QuestionMarksChecker().run(string4));
		assertEquals(true, new QuestionMarksChecker().run(new String("7v???bb3c")));
		assertEquals(true, new QuestionMarksChecker().run(string5));
		assertEquals(true, new QuestionMarksChecker().run(string6));
		assertEquals(true, new QuestionMarksChecker().run(new String("b5???5")));
	}
	
	@Test
	public void checkerReturnsFalseIfThereAreNot3xQuestionsMarksBetweenNumbersOfSum10SecondRun(){
		assertEquals(false, new QuestionMarksChecker().run(new String("4??6")));
		assertEquals(false, new QuestionMarksChecker().run(new String("3??vvvdd7")));
		assertEquals(false, new QuestionMarksChecker().run(new String("7??2??87")));
		assertEquals(false, new QuestionMarksChecker().run(new String("2?c?8v2vdd7")));
		assertEquals(false, new QuestionMarksChecker().run(new String("fddgd4??6d")));
		assertEquals(false, new QuestionMarksChecker().run(new String("1?4d8a??f2c")));
		assertEquals(false, new QuestionMarksChecker().run(new String("ifg9?w1dd")));
		assertEquals(false, new QuestionMarksChecker().run(new String("2??8s7")));
	}
	
	@Test
	public void checkerReturnsFalseIfThereAre3xQuestionsMarksBetweenNumbersOfSumLessThan10(){
		assertEquals(false, new QuestionMarksChecker().run(new String("1???7")));
		assertEquals(false, new QuestionMarksChecker().run(new String("234???7")));
		assertEquals(false, new QuestionMarksChecker().run(new String("1?4d8?a??f1c")));
		assertEquals(false, new QuestionMarksChecker().run(new String("bv6cdw?ad?sd?2")));
		assertEquals(false, new QuestionMarksChecker().run(new String("4???cvv1")));
		assertEquals(false, new QuestionMarksChecker().run(new String("1xfserysytdyu???dvdfsd8")));
	}
	
	@Test
	public void checkerReturnsFalseIfThereAreLessThan3QuestionsMarksBetweenNumbersOfSum10(){
		assertEquals(false, new QuestionMarksChecker().run(new String("2??8")));
		assertEquals(false, new QuestionMarksChecker().run(new String("23??7")));
		assertEquals(false, new QuestionMarksChecker().run(new String("1?4d8?a?f1c")));
		assertEquals(false, new QuestionMarksChecker().run(new String("bv8cdwad?sd?2")));
		assertEquals(false, new QuestionMarksChecker().run(new String("4??cvv6")));
		assertEquals(false, new QuestionMarksChecker().run(new String("7xfserysytdyu??dvdfsd3")));
	}
}
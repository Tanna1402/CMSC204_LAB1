import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1;
	private GradeBook g2;
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * 2 objects of grafebook size 5
		 */
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		/*
		 * Call the addScore method for each of the Gradebook 
		 * classes at least twice (but no more than 5 times).
		 */
		g1.addScore(65);
		g1.addScore(80);
		
		g2.addScore(50);
		g2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 * set the two objects of Gradebook to null
		 */
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		
		/*
		 * compare the contents of what is in the scores array
		 *  vs. what is expected to be in the scores array
		 */
		assertTrue((g1.toString()).equals("65.0 80.0 "));
	    assertTrue((g2.toString()).equals("50.0 90.0 "));
	    
	    /*
	     * Compare the scoreSize to the expected number of scores entered.
	     */
	    assertEquals(2,g1.getScoreSize(),0.0001);
	    assertEquals(2,g2.getScoreSize(),0.0001);	
	}
	
	@Test
	void testSum() {
		/*
		 * Compare what is returned by sum() to the expected sum of the scores entered.
		 */
		assertEquals(145.0, g1.sum(), .0001);
		assertEquals(140.0,g2.sum(),.0001);	
	}
	
	@Test
	void testMinimum() {
		/*
		 * Compare what is returned by minimum() to the expected minimum of the scores entered
		 */
		assertEquals(65.0,g1.minimum(),.001);
		assertEquals(50.0,g2.minimum(),.001);
		
	}
	
	@Test
	void testFinalScore() {
		/*
		 * 
		 */
		assertEquals(80.0, g1.finalScore(), .0001);
	    assertEquals(90.0, g2.finalScore(), .0001);
	}
	

}

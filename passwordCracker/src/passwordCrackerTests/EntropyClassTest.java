package passwordCrackerTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import passwordCracker.EntropyChecker;


public class EntropyClassTest {
	
	private EntropyChecker entropyCheck;
	
	@Before
	public void setUp(){
		entropyCheck = new EntropyChecker();
	}
	
	
	@After
	public void tearDown() throws Exception{
		entropyCheck = null;
	}
	
	@Test
	public void entropyGenerateSuccess(){
		
	}
	
	@Test
	public void entropyGenerateFailure(){
		
	}
	
	@Test
	public void userNoInput(){
		
	}
	
}

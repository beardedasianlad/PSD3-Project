package uk.ac.glasgow.sg.team5.toolkit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.sg.team5.toolkit.EntropyChecker;


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
	public void entropyGenerateEntropy(){
		entropyCheck.setPassword("abcds");
		assertEquals((double)13.2,entropyCheck.generateEntropy(),1e-8);
	}
	@Test
	public void entropyGenerateEntropyError(){
		entropyCheck.setPassword("");
		assertEquals(0,entropyCheck.generateEntropy(),1e-8);
	}
	
	
	
	@Test
	public void entropyGenerateVeryWeakPassword(){
		assertEquals("Password Strength: Very Weak\n", entropyCheck.calculatePasswordStrength(27));
	}
	@Test
	public void entropyGenerateWeakPasswordLowerBound(){
		assertEquals("Password Strength: Weak\n", entropyCheck.calculatePasswordStrength(28));
	}
	@Test
	public void entropyGenerateWeakPasswordUpperBound(){
		assertEquals("Password Strength: Weak\n", entropyCheck.calculatePasswordStrength(35));
	}
	@Test
	public void entropyGenerateReasonablePasswordLowerBound(){
		assertEquals("Password Strength: Reasonable\n", entropyCheck.calculatePasswordStrength(36));
	}
	@Test
	public void entropyGenerateReasonablePasswordUpperBound(){
		assertEquals("Password Strength: Reasonable\n", entropyCheck.calculatePasswordStrength(59));
	}
	@Test
	public void entropyGenerateStrongPasswordLowerBound(){
		assertEquals("Password Strength: Strong\n", entropyCheck.calculatePasswordStrength(60));
	}
	@Test
	public void entropyGenerateStrongPasswordUpperBound(){
		assertEquals("Password Strength: Strong\n", entropyCheck.calculatePasswordStrength(127));
	}
	@Test
	public void entropyGenerateVeryStrongPassword(){
		assertEquals("Password Strength: Very Strong\n", entropyCheck.calculatePasswordStrength(128));
	}
	
	
	
	
	
}

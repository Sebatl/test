/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Translator;

/**
 * @author Seba
 *
 */
public class TranslatorTest {

private Translator translator;
	
    @Before
    public void setUp() {
    	translator = new Translator();
    //	System.out.println("Setup OK");
    }

    @After
    public void tearDown() {
    	translator = null;
    	//System.out.println("Tear OK");
    }

	/**
	 * Test method for {@link code.Translator#printHelloWorld(java.lang.String)}.
	 */
	@Test
	public void testPrintHelloWorld() {
		assertEquals("Hola Mundo", translator.printHelloWorld("ESP"));
		assertEquals("Hello World", translator.printHelloWorld("ENG"));
	}

}

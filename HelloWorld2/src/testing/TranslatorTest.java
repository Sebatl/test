/**
 * 
 */
package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Translator;
import junit.framework.TestCase;

/**
 * @author Seba
 * Clase de prueba para Translator
 */
public class TranslatorTest  extends TestCase {

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
		assertEquals("Hola mundo", translator.printHelloWorld("ESP"));
		assertEquals("Hello World", translator.printHelloWorld("ENG"));
	}

}

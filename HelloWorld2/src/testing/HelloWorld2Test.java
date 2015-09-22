package testing;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import code.HelloWorld2;

public class HelloWorld2Test extends TestCase {
	
	private HelloWorld2 hello;
	
    @Before
    public void setUp() {
    	hello = new HelloWorld2();
    //	System.out.println("Setup OK");
    }

    @After
    public void tearDown() {
    	hello = null;
    	//System.out.println("Tear OK");
    }

    @org.junit.Test
    public void testEngLanguage() {
        assertEquals(hello.printEng(), "Hello world");
        System.out.println("@Test - ENG OK");
    }
    
    @org.junit.Test
    public void testSpaLanguage() {
        assertEquals(hello.printSpa(), "Hola mundo");
        System.out.println("@Test - SPA OK");
    }
    
    @org.junit.Test
    public void testFreLanguage() {
        assertEquals(hello.printFre(), "Bonjour tout le monde");
        System.out.println("@Test - FRE OK");
    }
    
    @org.junit.Test
    public void testIndLanguage() {
        assertEquals(hello.printInd(), "Halo dunia");
        System.out.println("@Test - IND OK");
    }
    
    @org.junit.Test
    public void testJavLanguage() {
        assertEquals(hello.printJav(), "Hello donya");
        System.out.println("@Test - JAV OK");
    }
    
    @org.junit.Test
    public void testYorLanguage() {
        assertEquals(hello.printYor(), "Kaabo aye");
        System.out.println("@Test - JAV OK");
    }
}

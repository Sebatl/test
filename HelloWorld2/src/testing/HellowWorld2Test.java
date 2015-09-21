package testing;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import code.HelloWorld2;

public class HellowWorld2Test extends TestCase {
	
	private HelloWorld2 hello;
	
	/*@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Before
    public void setUp() {
    	hello = new HelloWorld2();
        System.out.println("@Before - setUp");
    }

    @After
    public void tearDown() {
    	System.out.println("@After - tearDown");
    }

    @org.junit.Test
    public void testEngLanguage() {
        assertEquals(hello.printEng(), "Hello World");
        System.out.println("@Test - testEmptyCollection");
    }
}

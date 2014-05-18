/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.designpatternstests;

import za.ac.cput.designpatterns.singletonpattern.SingletonExample;
import org.junit.*;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class SingletonJUnitTest {
    
    public SingletonJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSingleton()
    {
        SingletonExample singletonExample = SingletonExample .getInstance () ;
        singletonExample .sayHello() ;

    }
}

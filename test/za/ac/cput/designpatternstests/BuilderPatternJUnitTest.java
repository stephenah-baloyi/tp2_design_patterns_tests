/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.designpatternstests;

import za.ac.cput.designpatterns.builderpattern.Meal;
import za.ac.cput.designpatterns.builderpattern.MealBuilder;
import za.ac.cput.designpatterns.builderpattern.MealDirector;
import za.ac.cput.designpatterns.builderpattern.ItalianMealBuilder;
import za.ac.cput.designpatterns.builderpattern.JapaneseMealBuilder;
import org.junit.*;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class BuilderPatternJUnitTest {
    
    public BuilderPatternJUnitTest() {
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
    public void testBuilderPattern() 
    {
        MealBuilder mealBuilder = new ItalianMealBuilder ();
        
        MealDirector mealDirector = new MealDirector(mealBuilder);
        
        mealDirector .constructMeal () ;
        Meal meal = mealDirector .getMeal() ;
        System .out.println("Meal is : " + meal);
        mealBuilder = new JapaneseMealBuilder () ;
        mealDirector = new MealDirector(mealBuilder);
        mealDirector .constructMeal () ;
        meal = mealDirector .getMeal() ;
        System .out.println("Meal is : " + meal);

    }
}

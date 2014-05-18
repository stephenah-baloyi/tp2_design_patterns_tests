/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.designpatterns.builderpattern;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class JapaneseMealBuilder implements MealBuilder {

        private Meal meal ;
        public JapaneseMealBuilder () {
        meal = new Meal() ;
        }
        @Override
        public void buildDrink() {
        meal .setDrink("sake");
        }
        @Override
        public void buildMainCourse () {
        meal .setMainCourse("chicken teriyaki");
        }
        @Override
        public void buildSide() {
        meal .setSide("miso soup");
        }
        @Override
        public Meal getMeal() {
        return meal ;
        }

}

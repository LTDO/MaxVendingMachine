

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

class MaxTest {
    private MaxiVendingMachine product = new MaxiVendingMachine();
    @Test
    void shouldTestSoftDrinkCount() {
        try {
            SoftDrink sprite = new SoftDrink("Low Sugar Sprite");
            product.buy(sprite);
            product.buy(sprite);
            assertEquals(sprite.getSoftDrinkCount(),3);
        } catch (SoftDrinkNotFoundException e) {
            System.out.println("Your thirst can't be quenched :-D");
        }
    }
    @Test
    void shouldTestSaltySnackCount(){
        try {
            SaltySnack pretzel = new SaltySnack("Salty Pretzels");
            product.buy(pretzel);
            product.buy(pretzel);
            assertEquals(pretzel.getSaltySnackCount(), 3);
        }catch (SaltySnackNotFoundException e){
            System.out.println("Better Luck next time! :-)");
        }
    }
    @Test
    void shouldTestChocolateCount(){
        try {
            Chocolate tex = new Chocolate("Tasty Tex");
            product.buy(tex);
            product.buy(tex);
            assertEquals(tex.getChocolateCount(), 3);
        }catch (ChocolateNotFoundException e){
            System.out.println("Your tex's are taxed, better luck next time :-D");
        }
    }
}

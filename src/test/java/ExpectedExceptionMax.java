import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpectedExceptionMax {

    private MaxiVendingMachine product = new MaxiVendingMachine();
    @Test
    void testExpectedSoftDrinkException() {
        SoftDrink coke = new SoftDrink("Cocoa Cola");
        product.addStock(coke);
        product.buy(coke);
        product.buy(coke);
        product.buy(coke);
        product.buy(coke);
        product.buy(coke);
        product.buy(coke);
        Assertions.assertThrows(SoftDrinkNotFoundException.class, () -> {
            product.buy(coke);
        });
    }
    @Test
    void testExpectedSaltySnackNotFoundException() {
        SaltySnack pretzel = new SaltySnack("Salty Pretzel");
        product.addStock(pretzel);
        product.buy(pretzel);
        product.buy(pretzel);
        product.buy(pretzel);
        product.buy(pretzel);
        product.buy(pretzel);
        product.buy(pretzel);
        Assertions.assertThrows(SaltySnackNotFoundException.class, () -> {
            product.buy(pretzel);
        });
    }
    @Test
    void testExpectedChocolateNotFoundException() {
        Chocolate barOne = new Chocolate("Bar One");
        product.addStock(barOne);
        product.buy(barOne);
        product.buy(barOne);
        product.buy(barOne);
        product.buy(barOne);
        product.buy(barOne);
        product.buy(barOne);
        Assertions.assertThrows(ChocolateNotFoundException.class, () -> {
            product.buy(barOne);
        });
    }
}

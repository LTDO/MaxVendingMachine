import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddStockMax {
    MaxiVendingMachine product = new MaxiVendingMachine();

    @Test
    public void shouldTestAddStockForSoftDrink(){
        try{
            SoftDrink appleCider = new SoftDrink("Apple Cider");
            product.addStock(appleCider, 5);
            product.addStock(appleCider, 2);
            assertEquals(product.getSoftDrinkCount(), 12);
        }catch (InvalidProductException e){
            System.out.println("Added Product not available");
        }
    }

    @Test
    public void shouldTestAddStockForSaltySnack(){
        try{
            SaltySnack pretzel = new SaltySnack("Salty Pretzels");
            product.addStock(pretzel, 5);
            product.addStock(pretzel, 4);
            assertEquals(product.getSaltySnackCount(), 14);
        }catch (InvalidProductException e){
            System.out.println("Added Product is not valid");
        }
    }

    @Test
    public void shouldTestAddStockForChocolate(){
        try{
            Chocolate barOne = new Chocolate("Bar One");
            product.addStock(barOne, 5);
            product.addStock(barOne, 2);
            product.buy(barOne);
            assertEquals(product.getChocolateCount(), 12);
        }catch (InvalidProductException e){
            System.out.println("Added Product not available");
        }
    }

    @Test
    public void shouldTestTotalStockInMachine(){
        assertEquals(product.totalStockCount(), 15);
    }
}

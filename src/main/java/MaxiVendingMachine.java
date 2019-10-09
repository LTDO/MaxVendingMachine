public class MaxiVendingMachine extends VendingMachine {


     void buy(SoftDrink softDrink){
        if (softDrink.getSoftDrinkCount() <= 0) {
            throw new SoftDrinkNotFoundException();
        } else {
            softDrink.softBuy();
            softDrink.decrementTotalStock();
        }
    }
    void buy(SaltySnack saltySnack){
        if (saltySnack.getSaltySnackCount() <= 0) {
            throw new SaltySnackNotFoundException();
        } else {
            saltySnack.saltyBuy();
            saltySnack.decrementTotalStock();
        }
    }
    void buy(Chocolate chocolate){
        if (chocolate.getChocolateCount() <= 0) {
            throw new ChocolateNotFoundException();
        } else {
            chocolate.chocBuy();
            chocolate.decrementTotalStock();
        }
    }

     public void addStock(SoftDrink softDrink){
        softDrink.incrementSoft();
    }
    public void addStock(SaltySnack saltySnack){
        saltySnack.incrementSalt();
    }
    public void addStock(Chocolate chocolate){
        chocolate.incrementChoc();
    }

    @Override
    void buy(Product product) throws InvalidProductException, ProductNotFoundException {
        if(product != null) {
            if (product instanceof SoftDrink) {
                if (getSoftDrinkCount() <= 0) {
                    throw new SoftDrinkNotFoundException();
                } else {
                    softBuy();
                    decrementTotalStock();
                }
            } else if(product instanceof Chocolate){
                if(getChocolateCount() <= 0){
                    throw new ChocolateNotFoundException();
                }else{
                    chocBuy();
                    decrementTotalStock();
                }
            }
            else if(product instanceof SaltySnack){
                if (getSaltySnackCount() < 0){
                    throw new SoftDrinkNotFoundException();
                } else{
                    saltyBuy();
                    decrementTotalStock();
                }
            }
            else{
                throw new ProductNotFoundException();
            }
        } else {
            throw new InvalidProductException();
        }
    }


    public static void main(String[] args) {
        MaxiVendingMachine max = new MaxiVendingMachine();
    }
}

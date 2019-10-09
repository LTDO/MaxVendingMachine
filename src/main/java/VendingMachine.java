public class VendingMachine {

    private int stockCount = 0;
    private int softDrinkCount;
    private int saltySnackCount;
    private int chocolateCount;

    VendingMachine(int softDrinkCount, int saltySnackCount, int chocolateCount) {
        this.softDrinkCount = softDrinkCount;
        this.saltySnackCount = saltySnackCount;
        this.chocolateCount = chocolateCount;
    }

    VendingMachine(){
        this(5,5,5);
    }

    //ADD STOCK
    void addStock(Product prod, int newStock) {

        if(prod instanceof Chocolate){
            chocolateCount += newStock;
        }
        else if(prod instanceof SoftDrink){
            softDrinkCount += newStock;
        }
        else if(prod instanceof SaltySnack){
            saltySnackCount += newStock;
        }
        else{
            stockCount += newStock;
        }
    }

    //BUY METHOD
    void buy(Product product) throws InvalidProductException, ProductNotFoundException {
        if(product != null) {
            if (product instanceof SoftDrink) {
                if (softDrinkCount <= 0) {
                    throw new SoftDrinkNotFoundException();
                } else {
                    softDrinkCount--;
                    stockCount--;
                }
            } else if(product instanceof Chocolate){
                if(chocolateCount <= 0){
                    throw new ChocolateNotFoundException();
                }else{
                    chocolateCount--;
                    stockCount--;
                }
            }
            else if(product instanceof SaltySnack){
                if (saltySnackCount < 0){
                    throw new SoftDrinkNotFoundException();
                } else{
                    saltySnackCount--;
                    stockCount--;
                }
            }
            else{
                throw new ProductNotFoundException();
            }
        } else {
            throw new InvalidProductException();
        }
    }

    //GET STOCK
    int totalStockCount() {
        return  softDrinkCount + saltySnackCount + chocolateCount;
     }
     int getSoftDrinkCount(){
        return softDrinkCount;
     }
    int getChocolateCount(){ return chocolateCount; }
    int getSaltySnackCount(){
        return saltySnackCount;
    }

    void softBuy(){
        softDrinkCount--;
    }
    void saltyBuy(){
        saltySnackCount--;
    }
    void chocBuy(){
        chocolateCount--;
    }
    void decrementTotalStock(){stockCount--; }

    //Add Stock for MaxVendingMachine
    void incrementSoft(){
        softDrinkCount++;
    }
    void incrementSalt(){
        saltySnackCount++;
    }
    void incrementChoc(){
        chocolateCount++;
    }
}
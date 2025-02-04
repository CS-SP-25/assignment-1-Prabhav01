public class FortyFive_Tax implements SalesTaxBehavior {
    @Override
    public double calc(double amount){
        return amount * 0.045;
    }
}

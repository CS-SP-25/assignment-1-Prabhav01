public class Seven_Tax implements SalesTaxBehavior {
    @Override
    public double calc (double amount) {
        return amount * 0.07;
    }
}
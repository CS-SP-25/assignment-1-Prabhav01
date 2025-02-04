public class NoTax implements SalesTaxBehavior {
    @Override
    public double calc(double amount) {
        return 0.0;
    }
}
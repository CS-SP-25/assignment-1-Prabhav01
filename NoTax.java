public class NoTax implements SalesTaxBehavior {//for states with no tax rates such as Alaska
    @Override
    public double calc(double amount) {
        return 0.0;
    }
}

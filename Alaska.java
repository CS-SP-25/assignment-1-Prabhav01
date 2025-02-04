public class Alaska extends State {
    public Alaska() {
        setName("Alaska");
        setSalesTaxBehavior(new NoTax());
    }
    @Override
    public void displayTax(double amount){
        super.displayTax(amount);
    }
}
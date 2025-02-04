public class Indiana extends State {
    public Indiana() {
        setName("Indiana");
        setSalesTaxBehavior(new Seven_Tax());
    }
    @Override
    public void displayTax(double amount){
        super.displayTax(amount);
    }
}
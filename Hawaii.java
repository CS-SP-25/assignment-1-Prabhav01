public class Hawaii extends State {
    public Hawaii() {
        setName("Hawaii");
        setSalesTaxBehavior(new FortyFive_Tax());
    }

    @Override
    public void displayTax(double amount){
        super.displayTax(amount);
    }
}
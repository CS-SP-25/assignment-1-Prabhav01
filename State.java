public class State {
    private String name;
    private SalesTaxBehavior salesTaxBehavior;

    public void setName(String name){//setter
        this.name = name;
    }
    public void displayTax(double amount){
        double tax = salesTaxBehavior.calc(amount);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.\n", amount, name, tax);//requested output format
    }

    public void setSalesTaxBehavior(SalesTaxBehavior behavior) {
        this.salesTaxBehavior = behavior;
    }
}
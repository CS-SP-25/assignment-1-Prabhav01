public class SalesTaxCalculator {


    public static void main(String[] args) {
        if (args.length != 2) {// Exactly 2 arguments are expected (state and amount)
            System.out.println("Enter a valid state and valid amount");
        }
        State state;
        String input = args[0];//stores the state in input variable
        double amount = Double.parseDouble(args[1]);
        if (input.equalsIgnoreCase("Alaska")) {//checks for Alaska which leads to Alaska class
            state = new Alaska();
        }else if(input.equalsIgnoreCase("Indiana")){//checks for Indiana which leads to Indiana class
             state = new Indiana();
        }else if(input.equalsIgnoreCase("Hawaii")) {//checks for Hawaii which leads to Hawaii class
            state = new Hawaii();
        } else {//throws error as none of the provided states are listed
            System.out.println("Enter a valid state");
            return;
        }
        state.displayTax(amount);//call state class
    }
}

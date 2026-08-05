public class IncomeTransaction extends Transaction {
    
    public IncomeTransaction(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getType() {
        return "Income";
    }
    
    @Override
    public String toString() {
        return "[INCOME]  + BDT " + amount + " : " + description;
    }
}
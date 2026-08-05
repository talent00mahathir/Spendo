public class ExpenseTransaction extends Transaction {
    
    public ExpenseTransaction(double amount, String description) {
        super(amount, description);
    }

    @Override
    public String getType() {
        return "Expense";
    }

    @Override
    public String toString() {
        return "[EXPENSE] - BDT " + amount + " : " + description;
    }
}
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    
    public double getTotalIncome() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof IncomeTransaction) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double getTotalExpense() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t instanceof ExpenseTransaction) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double getNetBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}
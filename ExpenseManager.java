import java.util.ArrayList;

public class ExpenseManager {
private ArrayList<Expense> expenses = new ArrayList<>();


public void addExpense(double amount, String category, String date) {
    expenses.add(new Expense(amount, category, date));
}

public void viewExpenses() {
    if (expenses.isEmpty()) {
        System.out.println("No expenses recorded.");
        return;
    }

    for (Expense e : expenses) {
        e.displayExpense();
    }
}

public double getTotalExpense() {
    double total = 0;
    for (Expense e : expenses) {
        total += e.getAmount();
    }
    return total;
}


}

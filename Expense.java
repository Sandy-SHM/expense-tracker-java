public class Expense {
private double amount;
private String category;
private String date;


public Expense(double amount, String category, String date) {
    this.amount = amount;
    this.category = category;
    this.date = date;
}

public double getAmount() {
    return amount;
}

public void displayExpense() {
    System.out.println("Amount: ₹" + amount + ", Category: " + category + ", Date: " + date);
}


}


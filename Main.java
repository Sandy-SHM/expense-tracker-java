import java.util.Scanner;

public class Main {
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    ExpenseManager manager = new ExpenseManager();

    while (true) {
        System.out.println("\n1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. View Total Expense");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter category: ");
                String category = sc.nextLine();

                System.out.print("Enter date: ");
                String date = sc.nextLine();

                manager.addExpense(amount, category, date);
                System.out.println("Expense added!");
                break;

            case 2:
                manager.viewExpenses();
                break;

            case 3:
                System.out.println("Total Expense: ₹" + manager.getTotalExpense());
                break;

            case 4:
                System.out.println("Exiting...");
                return;

            default:
                System.out.println("Invalid choice!");
        }
    }
}


}

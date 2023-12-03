import java.util.Scanner;

class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    // Constructor
    public User(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: $" + balance);
    }

    // Method to add money to the balance
    public void cashIn(double amount) {
        balance += amount;
        System.out.println("Amount $" + amount + " added successfully.");
        checkBalance();
    }

    // Method to transfer money to another user
    public void moneyTransfer(User recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.cashIn(amount);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }
}

// ... (previous code)

public class Main {
    public static void main(String[] args) {
        // Creating user objects
        User user1 = new User(412435, 7452, "Chris Sandoval", 32000);
        User user2 = new User(264863, 1349, "Marc Yim", 1000);

        // Simulating login
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        // Check login credentials
        if (userId == user1.getId() && pin == user1.getPin()) {
            performBankingOperations(user1, user2);
        } else if (userId == user2.getId() && pin == user2.getPin()) {
            performBankingOperations(user2, user1);
        } else {
            System.out.println("Invalid User ID or PIN. Exiting...");
        }
    }

    // Method to perform banking operations
    private static void performBankingOperations(User user, User otherUser) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome, " + user.getName() + "!");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-In");
            System.out.println("3. Money Transfer");
            System.out.println("4. Logout");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    user.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to cash-in: $");
                    double amount = scanner.nextDouble();
                    user.cashIn(amount);
                    break;
                case 3:
                    System.out.print("Enter recipient's User ID: ");
                    int recipientId = scanner.nextInt();
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();

                    // Find the recipient user
                    User recipient = (recipientId == user.getId()) ? user : otherUser;

                    // Transfer money
                    user.moneyTransfer(recipient, transferAmount);
                    break;
                case 4:
                    System.out.println("Logging out. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

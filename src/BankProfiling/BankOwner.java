package BankProfiling;

public class BankOwner {
    private BankProfiling encap;

    public BankOwner() {
        encap = new BankProfiling();
    }

    public void deposit(double amount) {
    if (amount > 0) {
        double currentBalance = encap.getBalance(); // Get the current balance using the instance variable
        currentBalance += amount; // Update the balance
        encap.setBalance(currentBalance); // Set the updated balance using the instance variable
        System.out.println("Deposited: $" + amount);
    } else {
        System.out.println("Invalid deposit amount. Please enter a positive value.");
    }
}

    public void displayAccountSummary() {
        encap.setName("Rodeus");
        encap.setAge(17);
        encap.setBalance(1000);
        encap.setAccountnumber(123456789);

        System.out.println("Account Summary:");
        System.out.println("Name: " + encap.getName());
        System.out.println("Age: " + encap.getAge());
        System.out.println("Account Number: " + encap.getAccountnumber());
        System.out.println("Balance: $" + encap.getBalance());
    }

    public static void main(String[] args) {
    BankOwner amount = new BankOwner();

    // Deposit some money
    amount.deposit(220);
    amount.deposit(100);

    // Print the account summary dili ma add ang 200 0g 100 ambot ngano huhuhuhuhu
    amount.displayAccountSummary();
    }  
    
}

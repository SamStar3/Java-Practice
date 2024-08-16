package ArrayLists;


import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class AutoBoxing {

    public static void main(String[] args) {
        Customer sam = new Customer("Sam S",1000.0);
        System.out.println(sam);

        Bank bank = new Bank("SBI");
        bank.addNewCustomer("John S",500.0);
        System.out.println(bank);

        bank.addTransaction("John S",-10.25);
        bank.addTransaction("john S",-75.01);
        bank.printStatement("John S");

        bank.addNewCustomer("sam S",25);
        bank.addTransaction("Sam S", 100);
        bank.printStatement("Sam S");
    }

}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer (String customerName) {
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't fount %n", customerName );
        return null;
    }

    public void addNewCustomer(String customerName,double initialDeposit) {
        if (getCustomer(customerName) ==null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d,d < 0 ? "debit" : "credit");
        }
    }
}
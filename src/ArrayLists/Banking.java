package ArrayLists;

import java.util.ArrayList;

public class Banking {

}

//public class Banking {
//    private String name;
//    private ArrayList<Branch> branches;
//
//    public Banking(String name) {
//        this.name = name;
//        this.branches = new ArrayList<>();
//    }
//
//    public boolean addBranch(String branchName) {
//        if (findBranch(branchName) == null) {
//            this.branches.add(new Branch(branchName));
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
//        Branch branch = findBranch(branchName);
//        if (branch != null) {
//            return branch.newCustomer(customerName, initialTransaction);
//        }
//        return false;
//    }
//
//    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
//        Branch branch = findBranch(branchName);
//        if (branch != null) {
//            return branch.addCustomerTransaction(customerName, transaction);
//        }
//        return false;
//    }
//
//    private Branch findBranch(String branchName) {
//        for (Branch branch : this.branches) {
//            if (branch.getName().equals(branchName)) {
//                return branch;
//            }
//        }
//        return null;
//    }
//
//    public boolean listCustomers(String branchName, boolean showTransactions) {
//        Branch branch = findBranch(branchName);
//        if (branch != null) {
//            System.out.println("Customer details for branch " + branch.getName());
//            ArrayList<Customer> branchCustomers = branch.getCustomers();
//            for (int i = 0; i < branchCustomers.size(); i++) {
//                Customer branchCustomer = branchCustomers.get(i);
//                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
//                if (showTransactions) {
//                    System.out.println("Transactions");
//                    ArrayList<Double> transactions = branchCustomer.getTransactions();
//                    for (int j = 0; j < transactions.size(); j++) {
//                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
//                    }
//                }
//            }
//            return true;
//        }
//        return false;
//    }
//}
//
//public class Branch {
//    private String name;
//    private ArrayList<Customer> customers;
//
//    public Branch(String name) {
//        this.name = name;
//        this.customers = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<Customer> getCustomers() {
//        return customers;
//    }
//
//    public boolean newCustomer(String customerName, double initialTransaction) {
//        if (findCustomer(customerName) == null) {
//            this.customers.add(new Customer(customerName, initialTransaction));
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addCustomerTransaction(String customerName, double transaction) {
//        Customer existingCustomer = findCustomer(customerName);
//        if (existingCustomer != null) {
//            existingCustomer.addTransaction(transaction);
//            return true;
//        }
//        return false;
//    }
//
//    private Customerd findCustomer(String customerName) {
//        for (Customer customer : this.customers) {
//            if (customer.getName().equals(customerName)) {
//                return customer;
//            }
//        }
//        return null;
//    }
//}
//
//
//public class Customerd {
//    private String name;
//    private ArrayList<Double> transactions;
//
//    public Customerd(String name, double initialTransaction) {
//        this.name = name;
//        this.transactions = new ArrayList<>();
//        this.transactions.add(initialTransaction);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<Double> getTransactions() {
//        return transactions;
//    }
//
//    public void addTransaction(double transaction) {
//        this.transactions.add(transaction);
//    }
//}

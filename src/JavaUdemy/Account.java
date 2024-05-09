package JavaUdemy;

public class Account {
    private String name;
    private double balance;
    private String userName;
    private String userEmail;
    private String userPhone;

    public Account(){
        this("SBI", 2000.00, "John", "samjohn@gmail.com", "12345");
        System.out.println("Empty Constructor called");
    }

    public Account(String userName, String userEmail, String userPhone) {
        this("Axis", 2500.00,userName,userEmail,userPhone);
//        this.userName = userName;
//        this.userEmail = userEmail;
//        this.userPhone = userPhone;
    }

    public Account(String name, double balance, String userName, String userEmail, String userPhone ){
        System.out.println("Scound Cunstructor called");
        this.name = name;
        this.balance = balance;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }


    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $ " + this.balance);
    }
    public void withdrawFunds(double withdrawalAmount){
        if(balance - withdrawalAmount < 0 ) {
            System.out.println("Insufficient Funds. you only have $ " + balance + " in your account.");
        }else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $ " + withdrawalAmount + " processed, Remaining balance = $ " + balance);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}

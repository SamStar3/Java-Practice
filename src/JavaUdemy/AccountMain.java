package JavaUdemy;

public class AccountMain {
    public static void main(String[] args){
//        Account samsAccount = new Account("SBI", 2000.00, "John", "samjohn@gmail.com", "12345");

        Account samsAccount = new Account();
        System.out.println(samsAccount.getName());
        System.out.println(samsAccount.getUserPhone());
//        samsAccount.setName("SBI India");
//        samsAccount.setBalance(1000.0);
//        samsAccount.setUserEmail("samstar@gmail.com");
//        samsAccount.setUserName("Sam");
//        samsAccount.setUserPhone("9715665066");
        samsAccount.depositFunds(1000.0);
        samsAccount.withdrawFunds(100.0);

        Account JohnsAccount = new Account("Sam","samstar@gmail.com","4984384");
        System.out.println("Phone Number : " + JohnsAccount.getUserPhone() + " UserName : " + JohnsAccount.getUserName() );
    }
}

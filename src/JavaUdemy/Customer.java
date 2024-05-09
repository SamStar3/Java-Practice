package JavaUdemy;

public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(){
        this(5000,"Johnsam@gmail.com");
    }
    public Customer(int creditLimit, String emailAddress) {
        this("John",creditLimit,emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Cunstructor");
    }
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}

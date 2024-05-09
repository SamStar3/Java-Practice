package JavaUdemy;

public class CustomerMain {
    public static void main(String[] args) {
        Customer user = new Customer("Sam",100000,"samstar@gmail.com");

        System.out.println(user.getName());
        System.out.println(user.getCreditLimit());
        System.out.println(user.getEmailAddress());

        Customer SecondUser = new Customer();
        System.out.println(SecondUser.getName());
        System.out.println(SecondUser.getCreditLimit());
        System.out.println(SecondUser.getEmailAddress());

        Customer ThirdUser = new Customer(20000,"johnstar@gmail.com");
        System.out.println(ThirdUser.getName());
        System.out.println(ThirdUser.getCreditLimit());
        System.out.println(ThirdUser.getEmailAddress());


    }
}

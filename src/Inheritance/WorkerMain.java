package Inheritance;

public class WorkerMain {
    public static void main(String[] args){

        Employee sam = new Employee("Sam", "28/09/2002","15/6/2025");
        System.out.println(sam);
        System.out.println("Age = " + sam.getAge());
        System.out.println("Pay = " + sam.collectPay());

        SalariedEmployee john = new SalariedEmployee("John","12/7/2007","15/6/2026",35000);
        System.out.println(john);
        System.out.println("Joe's Paycheck = $" + john.collectPay());

        john.retire();
        System.out.println("John's Pension check = $" + john.collectPay());

        HourlyEmployee sowmi = new HourlyEmployee("Sowmi","18/9/2005","23/7/2026",15);
        System.out.println(sowmi);
        System.out.println("Sowmi's Paycheck = $" + sowmi.collectPay());
        System.out.println("Sowmi's Holiday Pay = $" + sowmi.getDoublePay());
    }
}

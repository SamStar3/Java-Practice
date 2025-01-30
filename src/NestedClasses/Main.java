package NestedClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001,"Ralph",2015),
                new Employee(10005,"Sam",2021),
                new Employee(10022,"John",2013),
                new Employee(13151,"Sounder",2020),
                new Employee(10050,"Jim",2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees){
            System.out.println(e);
        }

        System.out.println("Stone Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015,"Joe",2019,"Target"),
                new StoreEmployee(10515,"Meg",2021,"Walmart"),
                new StoreEmployee(10105,"Sowmi",2020,"Macys"),
                new StoreEmployee(10215,"Tom",2018,"Walmart"),
                new StoreEmployee(10322,"Jerry",2016,"Target")
        ));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);

        for(StoreEmployee e : storeEmployees){
            System.out.println(e);
        }
    }
}

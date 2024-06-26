package TheObjectClass;

public class Main extends Object{
    public static void main(String[] args){

        Student sam = new Student("Sam",22);
        System.out.println(sam);
        PrimarySchoolStudent john = new PrimarySchoolStudent("John",8,"Selvaraj");
        System.out.println(john);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " +age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}

package JavaUdemy;

public class StudentPOJOMain {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("ss4174" + i,
                    switch (i){
                case 1 -> "Sam";
                case 2 -> "John";
                case 3 -> "Sowmi";
                case 4 -> "Elizabeth";
                case 5 -> "Sounder";
                default -> "Anonymous";
                    },
                    "28/09/2001",
                    "Java Class");
            System.out.println(s);

        }
        StudentPOJO pojo = new StudentPOJO("sr3423","Revanth","23/5/1999","Java Class");
        LPAStudent recordStudent = new LPAStudent("rr3422","David","2/4/2000","Java Class");
        System.out.println(pojo);
        System.out.println(recordStudent);
        pojo.setClassList(pojo.getClassList() + " Java OCP exam 983");
        System.out.println(pojo.getName() + " is taking " + pojo.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}

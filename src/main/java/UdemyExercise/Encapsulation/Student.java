package UdemyExercise.Encapsulation;

public class Student {
    //    private String name="nishanth";
//
//    public String getName() {
//        return name;
//    }
//
//    private int rollNo;
//    private String email;
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("nishanth");
        student.setAge(22);
        System.out.println("Student name:" + student.getName());
        System.out.println("Student age:" + student.getAge());
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private final String studentId; // final
    protected double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // constructor chaining
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    public GradStudent(String name, int age, String studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa); // constructor chaining
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Ragini",
                22,
                "CS101",
                9.1,
                "Artificial Intelligence"
        );

        System.out.println(gs);

        // Demonstrating IS-A relationship
        Person p = gs;
        Student s = gs;

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student: " + (s instanceof Student));
        System.out.println("GradStudent IS-A Person: " + (p instanceof Person));
    }
}
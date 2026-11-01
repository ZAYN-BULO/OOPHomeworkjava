stract class Person {

    // 1. Encapsulation
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 2. Abstraction
    public abstract void introduce();
}

// 3. Inheritance
class Student extends Person {

    private int studentId;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("I am a student.");
        System.out.println("My name is " + getName());
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {

    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("I am a teacher.");
        System.out.println("My name is " + getName());
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class OOPHomeworkjava {

    public static void main(String[] args) {

        // 4. Objects
        Student s1 = new Student();
        s1.setName("Abel");
        s1.setStudentId(101);

        Teacher t1 = new Teacher();
        t1.setName("Dawit");
        t1.setSubject("Java Programming");

        // 5. Polymorphism
        Person p1 = s1;
        Person p2 = t1;

        System.out.println("=== Student Information ===");
        p1.introduce();

        System.out.println();

        System.out.println("=== Teacher Information ===");
        p2.introduce();
    }
}

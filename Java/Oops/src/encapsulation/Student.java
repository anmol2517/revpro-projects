package encapsulation;

// Class 1: Student
public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public void setName(String name) { if(name != null) this.name = name; }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { if(grade >= 1 && grade <= 12) this.grade = grade; }

    public void displayInfo() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

// Class 2: Teacher
class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() { return name; }
    public void setName(String name) { if(name != null) this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { if(subject != null) this.subject = subject; }

    public void displayInfo() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

// Class 3: Classroom
class Classroom {
    private String roomNumber;
    private Teacher classTeacher;
    private Student[] students;

    public Classroom(String roomNumber, Teacher classTeacher, Student[] students) {
        this.roomNumber = roomNumber;
        this.classTeacher = classTeacher;
        this.students = students;
    }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { if(roomNumber != null) this.roomNumber = roomNumber; }

    public Teacher getClassTeacher() { return classTeacher; }
    public void setClassTeacher(Teacher classTeacher) { this.classTeacher = classTeacher; }

    public Student[] getStudents() { return students; }
    public void setStudents(Student[] students) { this.students = students; }

    public void displayClassInfo() {
        System.out.println("Classroom: " + roomNumber);
        System.out.print("Class Teacher → ");
        classTeacher.displayInfo();
        System.out.println("Students in class:");
        for(Student s : students) s.displayInfo();
    }
}

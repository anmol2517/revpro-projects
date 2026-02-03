package encapsulation;

public class Students {
    private String studentName;
    private int rollNo;
    private double marks;

    // Constructor
    public Students(String studentName, int rollNo, double marks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if(studentName != null && !studentName.isEmpty()) {
            this.studentName = studentName;
        } else {
            System.out.println("Invalid name!");
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if(rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Roll number must be positive.");
        }
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

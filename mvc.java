
class Student {
    // MODEL: Stores the data
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

class StudentView {
    // VIEW: Displays the data
    public void displayStudent(String name, int marks) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

class StudentController {
    // CONTROLLER: Connects Model and View
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentMarks(int marks) {
        model.setMarks(marks);
    }

    public void updateView() {
        view.displayStudent(
            model.getName(),
            model.getMarks()
        );
    }
}

public class mvc {
    public static void main(String[] args) {
        // Create Model
        Student student = new Student("Aditya", 85);

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
            new StudentController(student, view);

        // Display student details
        controller.updateView();

        // Update marks through Controller
        controller.setStudentMarks(95);

        System.out.println("\nAfter updating marks:");
        controller.updateView();
    }
}

import java.util.Arrays;

public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        int sId = s.getId();
        students[sId] = s;
        currentSize++;
    }

    public String studentNames() {
        Student[] students = getStudents();
        String names = "";
        for (int i = 3; i < currentSize + 3; i++) {
            String studentName = students[i].getName();
            names += studentName;
            if (i < currentSize + 2) {
                names += ", ";
            }
        }
        return names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
    public String toString() {
        return this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: " + studentNames();
    }
}

import java.util.Arrays;

public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public String sectNames() {
        Section[] sections = getSections();
        String names = "";
        for (int i = 0; i < sectionCount; i++) {
            String sectionName = sections[i].getName();
            names += sectionName;
            if (i < sectionCount - 1) {
                names += ", ";
            }
        }
        return names;
    }

    public void addSection(Section s) {
        Section[] sections = getSections();
        sections[sectionCount] = s;
        sectionCount++;
    }

        @Override
    public String toString() {
        return getName() + " is in grade " + this.grade + " and is enrolled in the following sections: " + sectNames();
    }
}

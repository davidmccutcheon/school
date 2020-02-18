public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public String sectNames() {
        Section[] sects = getSections();
        String names = "";
        for (int i = 0; i < sectionCount; i++) {
            names += sects[i].getName();
        }
        return names;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        return getName() + " teaches the following sections: " + sectNames();
    }
}

public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections() {
        return sections;
    }

    @Override
    public String toString() {
        return "The school named " + this.name + " has " + this.sectionCount + " sections.";
    }
}

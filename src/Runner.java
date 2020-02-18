public class Runner {

    public static void main (String[] args) {
        School berkeley = new School("Berkeley High");

        Teacher austera = new Teacher("Austera", "Math");
        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher rodrigues = new Teacher("Rodrigues", "Theory of Knowledge");

        Section math = new Section("Math", austera);
        Section compSci = new Section("Computer Science", albinson);
        Section tok = new Section("Theory of Knowledge", rodrigues);

        Student david = new Student("David", 11);
        Student daniel = new Student("Daniel", 11);
        Student pastDavid = new Student("david", 10);
        Student pastDaniel = new Student("daniel", 10);
        Student futureDavid = new Student("DAVID", 12);
        Student futureDaniel = new Student("DANIEL", 12);

        Section[] sections = {math, compSci, tok};
        for (int i = 0; i < sections.length; i++) {
            berkeley.addSection(sections[i]);
        }

        austera.addSection(math);
        albinson.addSection(compSci);
        rodrigues.addSection(tok);

        Student[] students = {david, daniel, pastDavid, pastDaniel, futureDavid, futureDaniel};
        for (int j = 0; j < students.length; j++) {
            math.addStudent(students[j]);
            compSci.addStudent(students[j]);
            tok.addStudent(students[j]);

            students[j].addSection(math);
            students[j].addSection(compSci);
            students[j].addSection(tok);
        }

        System.out.println(berkeley.toString());
        System.out.println(austera.toString());
        System.out.println(albinson.toString());
        System.out.println(rodrigues.toString());
        System.out.println(math.toString());
        System.out.println(compSci.toString());
        System.out.println(tok.toString());
        System.out.println(david.toString());
        System.out.println(daniel.toString());
        System.out.println(pastDavid.toString());
        System.out.println(pastDaniel.toString());
        System.out.println(futureDavid.toString());
        System.out.println(futureDaniel.toString());
    }

}

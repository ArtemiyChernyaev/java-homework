import java.util.Arrays;

class Student implements Comparable<Student> {
    private final int id;
    private final int examScores;
    private final String name;

    Student(String name, int id, int examScores) {
        this.name = name;
        this.id = id;
        this.examScores = examScores;
    }

    public int getExamScores() {
        return examScores;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            int pos = i;
            Comparable min = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(min) < 0) {
                    pos = j;
                    min = list[j];
                }
            }
            list[pos] = list[i];
            list[i] = min;
        }
    }

    public static void main(String[] args) {
        Comparable[] idNumbers = {
                new Student("Name1", 1, 11),
                new Student("Name2", 2, 12),
                new Student("Name3", 3, 13),
                new Student("Name4", 4, 14),
                new Student("Name5", 5, 15)
        };

        selectionSort(idNumbers);
        System.out.println(Arrays.toString(idNumbers));
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", examScores=" + examScores +
                ", name='" + name + '\'' +
                "}\n";
    }

    public int compareTo(Student s) {
        return this.getId() < s.getId() ? -1 : this.getId() == s.getId() ? 0 : 1;
    }
}

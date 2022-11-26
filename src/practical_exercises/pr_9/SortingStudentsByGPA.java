import java.util.Arrays;

class SortingStudentsByGPA extends Student implements Comparable<Student> {

    SortingStudentsByGPA(String name, int id, int examScores) {
        super(name, id, examScores);
    }

    public static void quickSort(Comparable[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        Comparable border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[j].compareTo(border) < 0) j--;
            while (sortArr[i].compareTo(border) > 0) i++;
            if (i <= j) {
                Comparable swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    public int compareTo(Student s) {
        return this.getExamScores() < s.getExamScores() ? -1 :
                this.getExamScores() == s.getExamScores() ? 0 : 1;
    }

    public static void main(String[] args) {
        Student[] examScores = {
                new SortingStudentsByGPA("Name1", 1, 11),
                new SortingStudentsByGPA("Name2", 2,15),
                new SortingStudentsByGPA("Name3", 3,12),
                new SortingStudentsByGPA("Name4", 4,13),
                new SortingStudentsByGPA("Name5", 5,19)
        };

        System.out.println(Arrays.toString(examScores));
        quickSort(examScores,0, examScores.length-1);
        System.out.println(Arrays.toString(examScores));
    }
}

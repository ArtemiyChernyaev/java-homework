import java.util.Arrays;

class MergeLists extends Student implements Comparable<Student>{

    MergeLists(String name, int id, int examScores) {
        super(name, id, examScores);
    }

    public static Comparable[] mergeLists(Comparable[] list1, Comparable[] list2) {
        Comparable[] list = new Comparable[list1.length + list2.length];
        System.arraycopy(list1,0,list,0,list1.length);
        System.arraycopy(list2,0,list,list1.length,list2.length);

        for(int i = 0; i < list.length;i++) {
            int pos = i;
            Comparable min = list[i];
            for(int j = i+1;j<list.length;j++) {
                if(list[j].compareTo(min) < 0) {
                    pos = j;
                    min = list[j];
                }
            }
            list[pos] = list[i];
            list[i] = min;
        }

        return list;
    }

    public int compareTo(Student s) {
        return this.getName().compareToIgnoreCase(s.getName());
    }

    public static void main(String[] args) {
        Comparable[] studentNames = {
                new MergeLists("Name1", 1, 11),
                new MergeLists("Name2", 2,12),
                new MergeLists("Name3", 3,13),
                new MergeLists("Name4", 4,14),
        };

        Comparable[] studentNames1 = {
                new MergeLists("Name5", 5, 15),
                new MergeLists("Name6", 6,16),
                new MergeLists("Name7", 7,17),
                new MergeLists("Name8", 8,18),
        };


        System.out.println(Arrays.toString(mergeLists(studentNames, studentNames1)));
    }
}


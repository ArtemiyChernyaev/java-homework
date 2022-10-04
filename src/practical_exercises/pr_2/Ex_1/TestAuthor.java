package Ex_1;
public class TestAuthor {
    public static void main(String[] args) {
        Author A1 = new Author("Artur Shelby", "barbos@mail.usa", 'm');
        System.out.println(A1);
        System.out.println(A1.getName());
        System.out.println(A1.getEmail());
        System.out.println(A1.getGender());
        A1.setEmail("foma@zona.ru");
        System.out.println(A1.getEmail());
    }
}

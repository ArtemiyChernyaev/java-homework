//login: login0
//password: pass0
//login: login1
//password: pass1
import java.util.Scanner;

class User{
    public String login;
    public String password;
    public int[] cart;
    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.cart = new int[0];
    }

    public void AddInCart(int id) {
            int[] newCart = new int[this.cart.length+1];

            for (int i = 0; i < this.cart.length; i++){
                newCart[i] = this.cart[i];
            }
            newCart[this.cart.length] = id;

            this.cart = newCart;
    }
}



enum Products{
    MILK("Milk",  90,1),
    CHEESE("CHEESE", 150,2),
    BREAD("BREAD", 80,3),
    EGGS("EGGS", 160,4),
    PIZZA("PIZZA", 350,5),
    BURGER("BURGER", 250,6);
    public String name;
    public int price;
    public int id;

    Products(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String GetInfo(){
        return this.name + " price: " + this.price + " "+ "id: " + this.id;
    }
}

public class OnlineStore {

    public static int login(User[] users) {
        Scanner sc = new Scanner(System.in);
        String login;
        String password;

        while(true){
            System.out.println("Enter login:");
            login = sc.nextLine();
            System.out.println("Enter password:");
            password = sc.nextLine();

            for (int i = 0; i < users.length; i++){
                if((users[i].login.equals(login)) && (users[i].password.equals(password))){
                    return i;
                }
            }

            System.out.println("Invalid password or login.");
        }
    }

    public static void printGuide(){
        System.out.println("Список доступных функций");
        System.out.println("1 - Show catalogs");
        System.out.println("2 - Open cataloge");
        System.out.println("3 - Show cart");
        System.out.println("4 - Add to cart");
        System.out.println("5 - Buy");
    }
    public static void printCatalogs(){
        System.out.println("1 - Milk");
        System.out.println("2 - Dough");
        System.out.println("3 - Eggs");
        System.out.println("4 - Cooked");
    }

    public static void printCatalog(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter catalog id:");
        n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println(Products.MILK.GetInfo());
                System.out.println(Products.CHEESE.GetInfo());
                break;
            case 2:
                System.out.println(Products.BREAD.GetInfo());
                break;
            case 3:
                System.out.println(Products.EGGS.GetInfo());
                break;
            case 4:
                System.out.println(Products.PIZZA.GetInfo());
                System.out.println(Products.BURGER.GetInfo());
                break;
        }
    }

    public static void showCart(int userId, User[] users){
        for (int i = 0; i < users[userId].cart.length; i++){
            switch (users[userId].cart[i]){
                case 1:
                    System.out.println(Products.MILK.GetInfo());
                    break;
                case 2:
                    System.out.println(Products.CHEESE.GetInfo());
                    break;
                case 3:
                    System.out.println(Products.BREAD.GetInfo());
                    break;
                case 4:
                    System.out.println(Products.EGGS.GetInfo());
                    break;
                case 5:
                    System.out.println(Products.PIZZA.GetInfo());
                    break;
                case 6:
                    System.out.println(Products.BURGER.GetInfo());
                    break;
            }
        }
    }

    public static void addToCart(int userId, User[] users){
        int productId;

        System.out.println("Enter product id:");
        Scanner sc = new Scanner(System.in);
        productId = sc.nextInt();

        users[userId].AddInCart(productId);
    }

    public static void buy(int userId, User[] users){
        users[userId].cart = new int[0];
    }

    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User("login0", "pass0");
        users[1] = new User("login1", "pass1");

        int CurrentUserId = login(users);

        while(true){
            printGuide();
            int n;
            System.out.println("Enter command:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n){
                case 1:
                    printCatalogs();
                    break;
                case 2:
                    printCatalog();
                    break;
                case 3:
                    showCart(CurrentUserId, users);
                    break;
                case 4:
                    addToCart(CurrentUserId, users);
                    break;
                case 5:
                    buy(CurrentUserId, users);
                    break;
            }
        }
    }
}

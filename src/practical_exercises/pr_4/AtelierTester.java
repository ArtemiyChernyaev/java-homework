abstract class Atelier {
    public static void dressWoman(Clothes[] clothes){
        for(int i =0; i < clothes.length; i++){
            Class[] interfaces = clothes[i].getClass().getInterfaces();
            for(Class c : interfaces){
                if("WomenClothing".equals(c.getSimpleName())){
                    WomenClothing cont = (WomenClothing) clothes[i];
                    System.out.println(cont.dressWoman());
                }
            }
        }
    }
    public static void dressMan(Clothes[] clothes){
        for(int i =0; i < clothes.length; i++){
            Class[] interfaces = clothes[i].getClass().getInterfaces();
            for(Class c : interfaces){
                if("MenClothing".equals(c.getSimpleName())){
                    MenClothing cont = (MenClothing) clothes[i];
                    System.out.println(cont.dressMan());
                }
            }
        }
    }
}
enum Sizes {
    XXS(32){
        public String getDescription(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;
    Sizes(int euroSize){
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }
}
interface MenClothing {
    String dressMan();
}
interface WomenClothing {
    String dressWoman();
}
abstract class Clothes{
    protected Sizes size;
    protected double price;
    protected String color;
}
class TShirt extends Clothes implements MenClothing,WomenClothing{
    public TShirt(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String dressMan(){
        return "Dressing man with Tshirt size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
    public String dressWoman(){
        return "Dressing woman with Tshirt size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
}
class Pants extends Clothes implements MenClothing,WomenClothing{
    public Pants(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String dressMan(){
        return "Dressing man with Pants size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
    public String dressWoman(){
        return "Dressing woman with Pants size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
}
class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public String dressWoman(){
        return "Dressing woman with skirt size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
}
class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String dressMan(){
        return "Dressing man with tie size: "+this.size.toString()+" color: " + this.color + " price: " + this.price;
    }
}

public class AtelierTester {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(Sizes.M,1 , "Red");
        clothes[1] = new Pants(Sizes.XS, 2, "Black");
        clothes[2] = new Skirt(Sizes.XS, 3, "Red");
        clothes[3] = new Tie(Sizes.L, 1, "Yellow");
        Atelier.dressWoman(clothes);
        Atelier.dressMan(clothes);
    }
}
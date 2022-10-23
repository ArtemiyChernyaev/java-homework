enum SeasonsEnum {
    SPRING(10),
    SUMMER(25){
        public String getDescription(){
            return "Теплое время года";
        }
    },
    FALL(5),
    WINTER(-15);

    private double averageTemp;

    SeasonsEnum(double averageTemp) {
        this.averageTemp = averageTemp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
    public double getAverageTemp(){
        return this.averageTemp;
    }
}

public class Seasons {
    public static void main(String[] args) {
        SeasonsEnum favouriteSeason = SeasonsEnum.SUMMER;
        System.out.println(favouriteSeason.getDescription());
        System.out.println(favouriteSeason.getAverageTemp());

        WhatSeasonLove(SeasonsEnum.FALL);

        for(SeasonsEnum season: SeasonsEnum.values()){
            System.out.println(season.toString() + " Temp: " + season.getAverageTemp() + " Description: " + season.getDescription());
        }
    }
    public static void WhatSeasonLove(SeasonsEnum se) {
        switch (se) {
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case FALL:
                System.out.println("I love fall");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
        }
    }
}

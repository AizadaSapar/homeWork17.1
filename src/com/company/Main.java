package com.company;

public class Main {

    public static void main(String[] args) {

        Farm farm1 = new Farm();
        Farm farm2 = new Farm();
        Cow cow = new Cow(50,5,'m',"Maik");
        Cow cow1 = new Cow(3,10,'j',"Maika");
        Cow cow2 = new Cow(100,2,'m',"Zoika");
        Cow cow3 = new Cow(120,10,'j',"jenia");
        Cow cow4 = new Cow(110,5,'m',"jora");
        Sheep sheep = new Sheep(10,1,'m',"Bi");
        Sheep sheep1 = new Sheep(20,3,'m',"senia");
        Sheep sheep2 = new Sheep(50,4,'m',"Jai");
        Horse horse = new Horse(140,9,'m',"Miky","ret");
        Horse horse1 = new Horse(160,12,'m',"Fakir","black");

        farm1.setAddress("Narin");
        farm1.setOwnerName("Jaikop");
        farm1.setCows(new Cow[]{cow,cow1,cow2,cow3,cow4 });
        farm1.setHorses(new Horse[]{horse,horse1});
        farm1.setSheep(new Sheep[]{sheep,sheep1,sheep2});
        farm2.setAddress("Issik-kul");
        farm2.setOwnerName("Nursultan");
        farm2.setCows(new Cow[]{cow});
        farm2.setSheep(new Sheep[]{sheep});
        farm2.setHorses(new Horse[]{horse});

        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);



    }
}

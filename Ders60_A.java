public class Ders60_A {
    public static void main(String[] args) {
        Ders60 audi = new Ders60();
        audi.model = "Audi A3";
        audi.type = "Sports";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.printSpeed();

       // System.out.println(audi.model + " Hızı: " + audi.speed);
       // System.out.println(audi.type);

        Ders60 bmw = new Ders60();
        bmw.model = "BMW";
        bmw.speed = 20;
        // System.out.println(bmw.model + " Hızı: " + bmw.speed);

        Ders60 mercedes = new Ders60();
        mercedes.model = "mercedes";
        mercedes.speed = 30;
        //System.out.println(mercedes.model + " Hızı: "+ mercedes.speed);
    }
}

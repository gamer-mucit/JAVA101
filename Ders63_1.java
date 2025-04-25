public class Ders63_1 {
    public static void main(String[] args) {
        Ders63_1A marc = new Ders63_1A("Marc" , 15 , 100, 90, 0);
        Ders63_1A alex = new Ders63_1A("Alex" , 10 , 60, 100, 0);
        Ders63_1B r = new Ders63_1B(marc,alex , 90 , 100);
        r.run();
    }
}
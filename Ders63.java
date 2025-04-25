public class Ders63 {
    public static void main(String[] args) {
        Ders63_0A f1 = new Ders63_0A("A",30,120,100,40);
        Ders63_0A f2 = new Ders63_0A("B",20,85,85,30);

        Ders63_0B match = new Ders63_0B(f1,f2,85,100);
        match.run();
    }
}

public class Ders22 {
    public static void main(String[] args) {
        int a =10,b = 20,c = 5,d;
        boolean kosul1 = (a < b);
        boolean kosul2 = (a > c);
        boolean sonuc = kosul1 || kosul2;
        d = (a==b)? 2 : 3;
        System.out.println(!sonuc);
        System.out.print(d);
    }
}

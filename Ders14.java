public class Ders14 {
    public static void main(String[] args) {
        int a = 5,b = 4,c = 5;
        boolean kosul1 = (a == c);
        boolean kosul2 = (a >= b);
        boolean sonuc1 = kosul1 || kosul2;
        /*
        boolean sonuc2 = !((a == c) || (a >= b));
        System.out.println(sonuc2);*/

        String str = sonuc1 ? "dogru":"yanlis";
        int result = sonuc1 ? 1 : 0;
        //burda önemli olan veri tipi ile dönecek değerin aynı olmasıdır int ise sayı string ise ifade
        System.out.println(str);
        System.out.println(result);



    }
}

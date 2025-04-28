public class Ders74 {
    public static void main(String[] args) {
        String str = "Patika";
        String[] p = str.split("a");//str ifadesin deki a ifadekerini çıkararak yeni bir eleman oluşturdu
        String patika = "paTika";
        System.out.println(str.trim());//strin ifadenin her iki  ucundaki boşluğu kaldırır
        System.out.println(str.toLowerCase());//tüm karakterleri küçük yazar
        System.out.println(str.toUpperCase()); // tüm karakterleri büyük yazıcak
        System.out.println(str.substring(2,5));//string ifadenin 2 ile 5  arasını almasını söylüyoruz
        //aynı şekilde istesek ilk 2 hanesini almamak için sadece 2 yazmak yeterli olucak
        System.out.println(str.replace("a","b"));//strde bukunan a harfini b ile değiştirir
        System.out.println(str.isEmpty());//str boşmu onu kontrol eder
        System.out.println(str.indexOf('a'));//str de a harginin index numarasını verir ilk bulunan numarayı veririr ikinciyi göstermez
        System.out.println(str.equalsIgnoreCase("patiKa"));//içinde karşılatırılan ifadenin büyük küçüklüğüne bakmadan ne yzayorsa karşılaştırır
        System.out.println(str.equals("patika"));// string ifade patika mı diye kontrol ediyor true false
        System.out.println(str.endsWith("a"));//string a harfi ie bitmiş mi diye bakıyor
        System.out.println(str.startsWith("a"));//"     "   "   "   başlamış mı diye bakıyor
        System.out.println(str.contains("a"));//string ifadenin için de a harfi varmı varsa true yoksa false yazdır
        System.out.println(str.concat(".dev"));// str dizisinin sonuna .dev i ekledi
        System.out.println(str.compareTo(patika)); // iki diziyi sölükbilimsel olarak karşılatırır
        System.out.println(str.codePointAt(1));//belirtilen harfin unicodeunu verir
        System.out.println(str.charAt(2));//char karaterindeki 3. elemanı verir


    }
}

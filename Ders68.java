import java.util.Arrays;

public class Ders68 {
    public static void main(String[] args) {
        int[] list ={1,2,3,4};
        int[] list2 = {4,5,6,7,8};
        double[] list3 ={1.1,2.2,3.3};
        /*Ders68_0A helper = new Ders68_0A();
        helper.print(list);
        System.out.println();
        helper.print(list3);*/

       // Ders68_0A.print(list2);
        // artık yukarıdaki gibi bir helper kelime belirtmemiz gerekmeyecek kütüphane sayesinde belirtilen dosyadaki döngüleri burdan çalılıştırılabilecek
        System.out.print(Arrays.toString(list)); // bu metot bizim yazdığımız gibi diziyi yadırmamızı sağlar ek bir dögü istemeden
        Arrays.fill(list,10); // bu komut dizi içindeki tüm elemanları 10 yapar
        System.out.print(list);
        Arrays.fill(list,2,5,10);//indisi 2.elemandan başla 5. elemana kadar sayıları 10 yap
        Arrays.sort(list);//list dizisindeki tüm elemanları küçükten büyüğe sıralar
        // Arrys.binarySearch() metotdunu kullanmak için dizi küçükten büyüğe sıralı olmalıdır
        int index = Arrays.binarySearch(list,2); //listede bulunan 2 elemanını bulup indis numarasını indexe aktarır
        System.out.print("33'ün indeks : "+index);//2 nin indis numarasını yazdırır
        int[] copylist = Arrays.copyOf(list,5); // burda verilen dizinin kaç elemanını kopyalayıp bir başka diziye aktarım yapıyor
        int[] copylist2 = Arrays.copyOfRange(list,2,5);
        //burda ise kopyalanacak yerin hangi indis numaraları araasında olduğunu yazıyoruz mesela 2 ile 5 arası kopyala
        Arrays.equals(list,list2); //burda ise sonuç true false şeklinde döner list ile list2 aynıı bir birine eş mi diye bakar
    }
}

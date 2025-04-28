import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ders75 {
    public static void main(String[] args) {
        Random rand = new Random(); // javaya ait bir rastgel sayı sınıfı
        Scanner input = new Scanner(System.in);
        int right = 0;
        int[] wrong = new int[5];
        int number = rand.nextInt(100);
        boolean isWin = false;
        boolean isWrong = false;
        //içine yazılan sayı sınıfı kaç ile çarpılacağını belirtit şu şekilde aralık 0-100 oldu
        // random saylar genellikle1-0 arasında geldiği için double değer olur bu şekilde de double değeri integre değere çevirmiş oluruz
        //int number = (int) (Math.random() * 100);
        // burda bir double değeri (int) ile yazarsak onu integre değerine çeviririz

        int selected;
        while (right < 5) {
            System.out.println("lütfen tahmininizi girin: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında değer girin");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız ! \nKalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hata girişinizde hakkınızdan düşülecektir");

                }
                continue;
            }
            if (selected == number) {
                System.out.println("tebrikler doğru tahmin ettiniz ! \nTahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {

                System.out.println("hatalı bir sayı girdiniz !");
                if (selected > number)
                    System.out.println(selected + "sayısı, gizli sayıdan büyüktür");
                else
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür");

                wrong[right] = selected;
                right++;
                System.out.println("kalan hakkı : " + (5 - right));

            }
        }

        if (!isWin && !isWrong) {
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }

    }
}

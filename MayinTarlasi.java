import java.util.Scanner;

public class MayinTarlasi {
    Scanner input = new Scanner(System.in);

    int k, t;
    int sayi, kutu;
    String[][] myer;
    String[][] kopya;

    void MayinTablo(int i, int j) {
        this.k = i;
        this.t = j;
        this.sayi = (i * j) / 3;
        this.kutu = i * j;
        myer = new String[this.k][this.t];
        kopya = new String[this.k][this.t];
    }

    static void isWin(int patla) {
        if (patla == 1)
            System.out.print("Tekrar deneyin ! Oyunu kaybettiniz");
        else
            System.out.print("Tebrikler ! Oyunu kazandınız");
    }

    void run() {
        // Mayın belirlenmesi
        for (int i = 0; i < this.sayi; i++) {
            int a, b;
            do {
                a = (int) (Math.random() * this.k);
                b = (int) (Math.random() * this.t);
            } while (this.myer[a][b] != null && this.myer[a][b].equals("***"));
            // Mayın aynı yere yerleştirilmesin
            this.myer[a][b] = "***";
        }

        // Mayın olmayan yerleri belirleme

        for (int i = 0; i < this.k; i++) {
            for (int j = 0; j < this.t; j++) {
                this.kopya[i][j] = "---";
                if (this.myer[i][j] == null) {
                    this.myer[i][j] = "---";

                }
            }
        }

        for (String[] row : this.myer) {
            for (String col : row)
                System.out.print(col + " ");
            System.out.println();
        }

        int x, y;
        System.out.println("Oyun Başlıyor ! ");
        System.out.println("seçtiğiniz kutunun kordinatlarını girin");

        int dondur = 0;
        int patlama = 0;

        while (dondur < (this.kutu - this.sayi)) {
            System.out.print("X konumunu girin : ");
            x = input.nextInt();
            System.out.print("Y konumunu girin : ");
            y = input.nextInt();

            int bomba = 0;

            // Koordinat kontrolü yapalım
            if (x < 0 || x >= this.k || y < 0 || y >= this.t) {
                System.out.println("Geçersiz koordinat! Tekrar deneyin.");
                continue;
            }


            if (this.myer[x][y].equals("***")) {
                patlama++;
                break;
            } else {
                // Komşu mayın sayısını kontrol etme
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        if (x + i >= 0 && x + i < this.k && y + j >= 0 && y + j < this.t) {
                            if (this.myer[x + i][y + j].equals("***")) {
                                bomba++;
                            }
                        }
                    }
                    this.kopya[x][y] = String.valueOf((" " + bomba + " "));
                }
                for (String[] row : kopya) {
                    for (String col : row)
                        System.out.print(col + " ");
                    System.out.println();
                }
                System.out.println();

                dondur++;
            }
        }

        isWin(patlama);

    }
}

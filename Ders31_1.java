import java.util.Scanner;
public class Ders31_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = "", burc = "", newMonth = "";
        boolean isError = false;
        int day;
        System.out.print("hangi ayda doğdunuz: ");
        newMonth = input.nextLine();
        month = newMonth.toUpperCase();
        System.out.print("doğdunuz günü girin: ");
        day = input.nextInt();

        if (month.equals("OCAK")) {
            if (day >= 1 && day <= 31) {
                if (day < 22)
                    burc = "oğlak";
                else
                    burc = "kova";
            } else
                isError = true;
        }

        else if (month.equals("SUBAT") || month.equals("ŞUBAT")) {
            if(day >= 1 && day <= 29){
                if(day <20)
                    burc = "kova";
                else
                    burc ="balık";
            } else
                isError = true;
        }

        else if (month.equals("MART")) {
            if(day >= 1 && day < 31){
                if(day <21)
                    burc = "balık";
                else
                    burc ="koç";
            } else
                isError = true;
        }

        else if (month.equals("NISAN") || month.equals("NİSAN")) {
            if(day >= 1 && day <= 30){
                if(day <21)
                    burc = "koç";
                else
                    burc ="boğa";
            }
            else
                isError = true;
        }

        else if (month.equals("MAYIS")) {
            if(day >= 1 && day <= 31){
                if(day <22)
                    burc = "boğa";
                else
                    burc ="ikizler";
            }
            else
                isError = true;
        }

        else if (month.equals("HAZİRAN") || month.equals("HAZIRAN")) {
            if(day >= 1 && day <= 30){
                if(day <23)
                    burc = "ikizler";
                else
                    burc ="yengeç";
            }
            else
                isError = true;
        }

        else if (month.equals("TEMMUZ")) {
            if(day >= 1 && day <= 31){
                if(day <23)
                    burc = "yengeç";
                else
                    burc ="aslan";
            }
            else
                isError = true;
        }

        else if (month.equals("AGUSTOS") || month.equals("AĞUSTOS")) {
            if(day >= 1 && day <= 31){
                if(day <23)
                    burc = "aslan";
                else
                    burc ="başak";
            }
            else
                isError = true;
        }

        else if (month.equals("EYLUL") || month.equals("EYLÜL")) {
            if(day >= 1 && day <= 30){
                if(day <23)
                    burc = "başak";
                else
                    burc ="terazi";
            }
            else
                isError = true;
        }

        else if (month.equals("EKİM") || month.equals("EKIM")) {
            if(day >= 1 && day <= 31){
                if(day < 23)
                    burc = "terazi";
                else
                    burc ="akrep";
            }
            else
                isError = true;
        }

        else if (month.equals("KASIM")) {
            if(day >= 1 && day < 30){
                if(day <22)
                    burc = "akrep";
                else
                    burc ="yay";
            }
            else
                isError = true;
        }

        else if (month.equals("ARALIK")) {
            if(day >= 1 && day < 31){
                if(day <22)
                    burc = "yay";
                else
                    burc ="kova";
            }
            else
                isError = true;
        }
        else
            System.out.print("lütfen geçerli bir ay yazın...");
        if(isError)
            System.out.print("lütfen geçerli bir sayı girin ...");
        else
            System.out.print("doğduğunuz güne göre burcunuz: "+ burc);

    }
}

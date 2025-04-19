import java.util.Scanner;
public class Ders31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day;
        String burc="";
        boolean isError = false;

        System.out.print("kaçıncı ayda doğduğunuzu girin: ");
        month = input.nextInt();
        System.out.print("doğdunuz günü girin: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >= 1 && day <= 31){
                    if(day <22)
                        burc = "oğlak";
                    else
                       burc ="kova";
                }
                else
                    isError = true;
                break;
            case 2:
                if(day >= 1 && day <= 29){
                    if(day <20)
                        burc = "kova";
                    else
                        burc ="balık";
                }
                else
                    isError = true;
                break;
            case 3:
                if(day >= 1 && day < 31){
                    if(day <21)
                        burc = "balık";
                    else
                        burc ="koç";
                }
                else
                    isError = true;
                break;
            case 4:
                if(day >= 1 && day <= 30){
                    if(day <21)
                        burc = "koç";
                    else
                        burc ="boğa";
                }
                else
                    isError = true;
                break;
            case 5:
                if(day >= 1 && day <= 31){
                    if(day <22)
                        burc = "boğa";
                    else
                        burc ="ikizler";
                }
                else
                    isError = true;
                break;
            case 6:
                if(day >= 1 && day <= 30){
                    if(day <23)
                        burc = "ikizler";
                    else
                        burc ="yengeç";
                }
                else
                    isError = true;
                break;
            case 7:
                if(day >= 1 && day <= 31){
                    if(day <23)
                        burc = "yengeç";
                    else
                        burc ="aslan";
                }
                else
                    isError = true;
                break;
            case 8:
                if(day >= 1 && day <= 31){
                    if(day <23)
                        burc = "aslan";
                    else
                        burc ="başak";
                }
                else
                    isError = true;
                break;
            case 9:
                if(day >= 1 && day <= 30){
                    if(day <23)
                        burc = "başak";
                    else
                        burc ="terazi";
                }
                else
                    isError = true;
                break;
            case 10:
                if(day >= 1 && day <= 31){
                    if(day < 23)
                        burc = "terazi";
                    else
                        burc ="akrep";
                }
                else
                    isError = true;
                break;
            case 11:
                if(day >= 1 && day < 30){
                    if(day <22)
                        burc = "akrep";
                    else
                        burc ="yay";
                }
                else
                    isError = true;
                break;
            case 12:
                if(day >= 1 && day < 31){
                    if(day <22)
                        burc = "yay";
                    else
                        burc ="kova";
                }
                else
                    isError = true;
                break;
            default:
                System.out.print("lütfen geçerli bir rakam girin");
        }
        if(isError)
            System.out.print("girdiğiniz ayda bugüne ait bir içerik içerilmiyor...");
        else
            System.out.print("doğdunuz güne göre burcunuz: "+ burc);
    }
}

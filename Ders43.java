import java.util.Scanner;
public class Ders43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayıyı giriniz: ");
        int number = input.nextInt();
        int basNumber = 0,result = 0,basValue,basPow,tempNumber;
        tempNumber = number;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for(int i = 0; i < basNumber;i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }
        if(number == result)
            System.out.print(number + " Armstrong sayıdır...");
        else
            System.out.print(number + " Armstrong sayı değildir...");
    }
}

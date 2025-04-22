import java.util.Scanner;
public class Odev09 {
    public static void main(String[] args) {
        for(int i = 2; i < 100;i++){
            if (i == 2 || i == 3 || i == 5|| i == 7|| i == 11)
                System.out.print(i + " ");
            else if(i % 2 == 1)
               if(!( i % 3 == 0 || i % 5 == 0 || i % 7==0 || i % 11 == 0) )
                   System.out.print(i + " ");


        }

    }
}

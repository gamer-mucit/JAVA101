import java.util.Scanner;
public class Ders37 {
    public static void main(String[] args) {
        int i=1;
        /*for(int i = 0;i<10;i++){
            if(i ==5){
                System.out.println(i);
                break;
            }
        }*/
        while(i <= 10){
            i++;
            if(i%2 ==0){
                continue;
            }
            System.out.println(i);

        }
    }
}

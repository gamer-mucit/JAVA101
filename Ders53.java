public class Ders53 {
    static boolean isPalidrom(int number){
        int temp = number,reverseNumber =0,lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /=10;
        }
        if(reverseNumber == number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
     System.out.print(isPalidrom(101));
    }
}

public class Ders48 {
     static int power(int base,int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args){

        int case1 = power(2,3);
        System.out.print(case1);
        /*int base = 2,exp = 3,result;
        for(int i=1;i <= exp; i++){
            result *= base;
        }
        exp = 2;
        System.out.print(result);

        base = 4;
        result = 1;

        for (int i = 1;i <= exp; i++){
            result *= base;
        }
        System.out.print(result);*/


    }
}

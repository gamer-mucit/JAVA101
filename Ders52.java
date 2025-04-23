public class Ders52 {
    static int f(int n){
        int result = 0;
        for(int i = 1;i <= n ;i++){
            result += i;
        }
        return result;
    }
    static int r(int n){
        System.out.print(n);
        if(n == 1)
            return 1;
        return r(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.print(f(2));
        r(10);
    }
}

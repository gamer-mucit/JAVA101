public class Ders50 {
    static void print(){
        System.out.print("parametresiz ...");
    }

    static void print(int a){
        System.out.print("parametresi: "+ a );
    }
    static int print(int a,int b){
        return a+b;
    }
    static int print(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        print();
        print(12);
        System.out.print(print(2,3));
        System.out.print(print(2,3,4));
    }
}

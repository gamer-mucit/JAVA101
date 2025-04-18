public class Ders24 {
    public static void main(String[] args) {
        int a=10,b=20,c=1;
        boolean d = a == b;
        /*String str = d ?"eşittir":"eşit değil";
        System.out.println(str);*/
        /*if (d){
            a =50;
            System.out.println("a sayısı"+a);
            System.out.println("eşittir");
        }else{
            System.out.print("eşit değildir");
        }
        System.out.print("program bitti...");*/
        if((a < b)&&(a < c)){
            System.out.print("a en kiçik sayıdır: "+a);
        }
       else if((a > b)&&(b < c)){
            System.out.print("b en kiçik sayıdır: "+b);
        }
        else {
            System.out.print("c en kiçik sayıdır: "+c);
        }
    }
}

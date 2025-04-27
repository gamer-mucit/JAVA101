public class Ders64 {
    /*static public void printArry(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }*/

    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for(int i = 0, j = list.length - 1; i<list.length;i++,j-- ){
            reverse[i] = list[j];
        }
        return reverse;
    }
    static void printArray(int[] list) {
        for(int i = 0;i<list.length;i++)
            System.out.println(list[i]);
    }

    public static void main(String[] args) {
        //int[] list = new int[10];
        //list[0] = 10;
        //list[1] = 20;
        //list[2] = 30;

        /*System.out.print(list[6]);
        for(int i = 0;i < list.length; i++){
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }*/

        int[] list = {10,20,30,40,50,60,70,80,90,100};
        int[] newListe = reverse(list);
       // double[] list2 ={1.1,2.2 }
        //System.out.println(list[9]);
        //for(int i = 0; i< list.length;i++){
            //System.out.println(list[i]);
        //}
         //printArry(list);
        printArray(newListe);

    }
}

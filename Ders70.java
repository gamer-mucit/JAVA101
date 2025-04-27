public class Ders70 {
    public static void main(String[] args) {
        int[] arr = {56,34,1,8,101,-2,-33};
        int max = arr[0];
        int min = arr[0];

        for(int i: arr){
            if(i < min){
                min = i;
            }
            if(max > i){
                max = i;
            }
        }

        System.out.println("Minumum değer: " + min);
        System.out.println("Maxsimum değer: " + max);
    }
}

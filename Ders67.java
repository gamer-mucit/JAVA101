public class Ders67 {
    public static void main(String[] args) {
        /*int[] list = {1, 2, 3, 4, 5};
        for (int i = 0; i < list.length; i++) {
            //System.out.print(list[i] + " ");
        }

        for (double i : list) {
            System.out.println(i);
        }*/
        /*String[] cars = {"BMW","MERCEDES","Audi"};
        for(String str:cars){
            System.out.println(str);
        }*/

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
       /* for(int i = 0;i< matris.length;i++){
            for(int k = 0;k<matris[i].length;k++){
                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }*/
        for(int[] row: matris){
            for(int col : row)
                System.out.print(col + " ");
            System.out.println();
        }

    }
}

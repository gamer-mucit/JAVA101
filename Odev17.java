import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        System.out.print("matrisin i degerini girin : ");
        i = input.nextByte();
        System.out.print("matrisin j degerini girin : ");
        j = input.nextByte();

        int[][] matris = new int[i][j];
        int[][] transpoze = new int[j][i];
        System.out.print("Elemanlarını girin: ");
        for (int k = 0; k < i; k++) {
            for (int b = 0; b < j; b++) {
                matris[k][b] = input.nextInt();
                transpoze[b][k] = matris[k][b];
            }
        }
        System.out.println("Matris : ");
        for (int[] row : matris) {
            for (int col : row)
                System.out.print(col + "  ");
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for (int[] row : transpoze) {
            for (int col : row)
                System.out.print(col + "  ");
            System.out.println();
        }
    }
}

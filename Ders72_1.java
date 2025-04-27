import java.util.Arrays;

public class Ders72_1 {
    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if(i==value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6,6,5,8,24,85,4,2,4,6,5,2,5,24,85,8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicate,list[i])){
                        if(list[i] %2 == 0)
                            duplicate[startIndex++] = list[i];
                        break;
                    }
                    else
                        break;
                }
            }
        }
        for(int value: duplicate){
            if(value != 0)
                System.out.print(value + ",");
        }
    }

}

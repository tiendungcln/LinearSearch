import java.sql.Array;

public class Level_3_2 {
    // Xóa x khỏi mảng

    public static void deleteX(int[] arr, int x){

        for (int i = 0; i < arr.length; i++){

            if (arr[i] == x){

                for (int j = i; j < arr.length - 1; j++){

                    arr[j] = arr[j + 1];

                }

                break;

            }

        }
        
        for (int i = 0; i < arr.length - 1; i++){

            System.out.print(arr[i] + " ");
            
        }

    }

    public static void main(String[] args){

        int[] arr = {3, 5 , 8, 5, 6};
        int x = 5;

        deleteX(arr, x);

    }

}

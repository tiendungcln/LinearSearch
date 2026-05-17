public class Level_2_3 {
    // Kiểm tra mảng có tăng dần không

    public static boolean isArrayAscending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            if (arr[i] > arr[i + 1]){

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args){

        int[] arr = {1, 3 , 5, 8, 9};

        if (isArrayAscending(arr)){
            System.out.println("Mảng tăng dần");
        }else{
            System.out.println("Mảng không tăng dần");
        }

    }

}

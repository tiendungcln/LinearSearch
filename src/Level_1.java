public class Level_1 {
    // Tìm xem số x có trong mảng không
    // [3, 7, 2, 9]
    // x = 2
    // => true

    public static boolean search_x(int[] arr, int x){

        for (int num : arr){
            if (num == x){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args){

        int[] arr = {3, 7, 2, 9};
        int x = 2;

        if (search_x(arr, x)){
            System.out.println("Đã tìm thấy x");
        }else{
            System.out.println("Không tìm thấy x");
        }

    }

}


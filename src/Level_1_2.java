public class Level_1_2 {
    // Đếm bao nhiêu số 8 trong mảng
    // Ví dụ:
    // [8, 2, 8, 5, 8]
    // x = 8
    // => 3

    public static int countOccurrences(int[] arr, int x){

        int count = 0;

        for (int num : arr){
            if (num == x){
                count ++;
            }
        }

        return count;

    }

    public static void main(String[] args){

        int[] arr = {8, 2, 8, 5, 8};
        int x = 8;

        System.out.println("Số lần " + x + " xuất hiện trong mảng là: " + countOccurrences(arr, x));

    }

}

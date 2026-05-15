public class Level_1_1 {
    // Trả về index đầu tiên của x
    // [5, 8, 1, 8]
    // x = 8
    // => 1

    public static int search_index(int[] arr, int x){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args){

        int[] arr = {5, 8, 1, 8};
        int x = 8;

        System.out.println("Index = " + search_index(arr, x));

    }

}

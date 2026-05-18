public class Level_3_3 {
    // Tìm cặp có tổng bằng target
    // Ví dụ:
    // [2, 7, 11, 15]
    // target = 9
    // => 2 + 7
    public static void findPairWithTarget(int[] arr, int target){

        for (int i = 0; i < arr.length; i++){

            for (int j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == target){

                    System.out.println("Cặp có tổng băng target là: " + arr[i] + " - " + arr[j]);

                }

            }

        }

    }

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        findPairWithTarget(arr, target);

    }

}

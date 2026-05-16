public class Level_2 {
    // Tìm số lớn nhất trong mảng
    // Tìm số nhỏ nhất trong mảng
    // Tìm max và min trong cùng 1 mảng
    // VD: [5, 1, 2, 3, 8]
    public static int searchMax(int[] arr){

        int max = arr[0];

        for (int num : arr){

            if (num > max){
                max = num;
            }

        }

        return max;

    }

    public static int searchMin(int[] arr){

        int min = arr[0];

        for (int num : arr){

            if (num < min){
                min = num;
            }

        }

        return min;

    }

    public static void searchMinAndMax(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for (int num : arr){

            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }

        }

        System.out.println("Min = " + min +" - " + "Max = " + max);

    }

    public static void main(String[] args){

        int[] arr = {9, 1, 2, 3, 8};
        System.out.println("Số lớn nhất là max = " + searchMax(arr));
        System.out.println("Số nhỏ nhất là min = " + searchMin(arr));
        searchMinAndMax(arr);

    }

}

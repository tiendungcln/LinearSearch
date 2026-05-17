import java.util.Arrays;

public class Level_2_1 {
    // Tính tổng, đảo mảng

    public static int sumArray(int[] arr){

        int total = 0;

        for (int num : arr){

            // total = total + num;
            total += num;

        }

        return total;

    }

    public static void reverseArray(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

        System.out.println("Mảng sau khi đảo lại là: " + Arrays.toString(arr));

    }

    public static void main(String[] args){

        int[] arr = {2, 3, 4, 5, 6};

        System.out.println("Total = " + sumArray(arr));
        reverseArray(arr);

    }

}

public class Level_3 {
    // Tìm số lớn thứ 2 (Find second largest number)
    // Tìm số nhỏ thứ 2 (Find second smallest number)

    public static int findSecondMax(int[] arr){

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr){
            if (num > firstMax){
                firstMax = num;
            }
        }

        for (int num : arr){
            if (num > secondMax && num < firstMax){
                secondMax = num;
            }
        }

        return secondMax;

    }

    public static int findSecondMin(int[] arr){

        int fisrtMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr){
            if (num < fisrtMin){
                fisrtMin = num;
            }
        }

        for (int num : arr){
            if (num < secondMin && num > fisrtMin){
                secondMin = num;
            }
        }

        return secondMin;

    }

    public static void main(String[] args){

        int[] arr = {-3, -5 , -7, -9, -4};
        System.out.println("Số lớn nhất thứ 2 trong mảng là: " + findSecondMax(arr));
        System.out.println("Số nhỏ nhất thứ 2 trong mảng là: " + findSecondMin(arr));

    }

}

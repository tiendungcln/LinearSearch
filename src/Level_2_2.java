public class Level_2_2 {
    // Tìm số chẵn đầu tiên trong mảng

    public static int findFirstEvenNumber(int[] arr){

        for (int num : arr){

            if(num % 2 == 0){

                return num;

            }

        }

        return -1;

    }

    public static void main(String[] args){

        int[] arr = {5, 7 , 8 , 6, 3};
        System.out.println("Số chẵn đầu tiên là: " + findFirstEvenNumber(arr));

    }

}

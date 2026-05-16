public class Level_1_3 {
    // Đếm tần suất xuất hiện của các số trong mảng
    // VD: [1, 2, 1, 3, 2]

    public static void printFrequencies(int[] arr){

        for (int i = 0; i < arr.length; i++){

            boolean isCounted = false;

            // Check xem arr[i] hiện tại và arr[k] trước đó có trùng nhau k
            // Mục đích để k in ra màn hình nhiều lần 1 số trùng nhau
            for (int k = 0; k < i; k++){
                if (arr[i] == arr[k]){
                    isCounted = true;
                    break;
                }
            }

            // Trùng thì k in ra và chạy lại vòng for i
            if (isCounted){
                continue;
            }

            int count = 0;

            for (int num : arr){
                if (num == arr[i]){
                    count++;
                }
            }

            System.out.println("Số lần lặp lại của " + arr[i] + " là: " + count);

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 1, 3, 2};
        printFrequencies(arr);

    }

}

    public class Level_3_1 {
        // Tìm phần tử xuất hiện nhiều nhất

        public static void findMostFrequent(int[] arr){

            int maxCount = 0; // Số lần xuất hiện nhiều nhất hiện tại
            int mostFrequent = 0; // Phần tử xuất hiện nhiều nhất hiện tại

            for (int current : arr){

                int count = 0;

                for (int num : arr){

                    if (num == current){
                        count++;
                    }

                }

                if (count > maxCount){

                    maxCount = count;
                    mostFrequent = current;

                }

            }

            System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + mostFrequent);

        }

        public static void main(String[] args){

            int[] arr = {3, 5, 1, 1, 2, 4 , 5 ,5};
            findMostFrequent(arr);

        }

    }

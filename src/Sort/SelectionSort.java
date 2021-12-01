package Sort;

public class SelectionSort {

        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 3, 1};
            selectionSrot(arr);

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        static void selectionSrot(int[] arr) {
            int temp;

            // 총 라운드 : 배열크기 - 1 번 진행
            for(int i=0; i<arr.length-1; i++) {
                // i 다음부터 끝까지 비교
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }


}

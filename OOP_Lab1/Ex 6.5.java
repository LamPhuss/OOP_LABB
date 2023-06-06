import java.util.Arrays;

public class sorting_numeric_array {
    public String sort(int arr[]){
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr.length - i -1 ; j ++ ){
                if (arr[j] < arr[j+1]) {
                        int m = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = m;

                }
            }
        }
        return Arrays.toString(arr);
    }
    public int calSum(int arr[]){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            sum += arr[i];
        }
        return sum;
    }
    public float calAverage(int arr[]){
        int avg = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            avg += arr[i];
        }
        return avg / arr.length;
    }
    public static void main(String[] args) {

    }
}

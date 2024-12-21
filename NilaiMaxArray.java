public class NilaiMaxArray {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int maxVal = findMax(arr, n - 1);
            return Math.max(maxVal, arr[n - 1]);
        }
    }
    public static void main(String[] args) {
    int[] myArray = {5, 2, 8, 1, 9};
    int maxValue = findMax(myArray, myArray.length);
    System.out.println("Nilai maksimum dalam array adalah: " + maxValue); 
    }
}
 

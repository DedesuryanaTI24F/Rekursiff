public class ElemenArray {
    public static boolean contains(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4};
        int n = 4;
        int target = 4;
        boolean found = contains(myArray, n, target);
System.out.println("Apakah array mengandung " + target + "? " + found);
    }   
}

public class Unique {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 5, 3, 6, 7, 1 };
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                System.out.print(arr[i] + " ");
        }
    }
}

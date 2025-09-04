public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        int[] A = new int[n + m];
        int[] B = {2, 4, 9};

        A[0] = 1;
        A[1] = 3;
        A[2] = 7;
        A[3] = 8;
        A[4] = 10;

        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k] = A[i];
                i--;
            } else {
                A[k] = B[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            A[k] = B[j];
            j--;
            k--;
        }

        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
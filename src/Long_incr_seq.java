import java.util.Scanner;

public class Long_incr_seq {
    public int[] Longest_Increasing_Sequence() {
        System.out.println("Introduceti numarul de elemente din sir: ");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] A = new int[n];
        System.out.println("Introduceti elementele sirului: ");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int current_start = 0, current_len = 1, max_start = 0, max_len = 0;
        for (int i = 1; i < n; i++) {
            if (A[i] >= A[i - 1]) {
                current_len++;
                if (current_len >= max_len) {
                    max_start = current_start;
                    max_len = current_len;
                }
            }
            else {
                current_start = i;
                current_len = 1;
            }
        }
        int[] B = new int[max_len];
        System.arraycopy(A, max_start, B, 0, max_len);
        return B;
    }
}

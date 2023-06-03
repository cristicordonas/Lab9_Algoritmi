public class Pascal_triangle {
    public int C(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return C(n - 1, k - 1) + C(n - 1, k);
    }
    public void  printPascal(int n){
        int[][] triangle = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= i; j++){
                if (i == j || j == 0)
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

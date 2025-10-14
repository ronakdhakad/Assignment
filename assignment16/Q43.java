class Q43 {
    public static void main(String[] args) {
        int a[][] = { {1, 2}, {3, 4} };
        int b[][] = { {5, 6}, {7, 8} };
        int add[][] = new int[2][2];
        int mul[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) 
            System.out.print(mul[i][j] + " ");
            System.out.println();
        }
    }
}

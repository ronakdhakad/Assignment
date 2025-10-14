class Q38{
    public static void main(String[] args) {
        int a[][] = { {1, 2}, {3, 4} };
        int b[][] = { {5, 6}, {7, 8} };
        int c[][] = new int[a.length + b.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }

        System.out.println("Row-wise Merge:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Q42 {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Ascending: ");
        for (int x : arr) System.out.print(x + " ");
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) max = j;
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        System.out.print("\nDescending: ");
        for (int x : arr) System.out.print(x + " ");
    }
}

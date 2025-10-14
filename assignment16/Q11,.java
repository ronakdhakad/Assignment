// 11) WAP showing the concept of Insertion sort
// 13) WAP to find out average of 5 numbers
// 14) WAP to find out simple interest
// 15) WAP to convert temp from f to c
class Q11{
    public static void main(String[] args) {
        int n = args.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(args[i]);
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int num : arr)
            System.out.print(num + " ");
    }
}

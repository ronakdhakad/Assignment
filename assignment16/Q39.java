import java.util.Scanner;
class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        System.out.print("Enter element to insert: ");
        int ele = sc.nextInt();
        System.out.print("Enter index (0-5): ");
        int pos = sc.nextInt();
        int newArr[] = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = ele;
            } else {
                newArr[i] = arr[j++];
            }
        }
        for (int x : newArr)
         System.out.print(x + " ");
    }
}

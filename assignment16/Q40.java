import java.util.Scanner;
class Q40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        System.out.print("Enter index to remove : ");
        int pos = sc.nextInt();
        int newArr[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == pos) continue;
            newArr[j++] = arr[i];
        }
        for (int x : newArr) 
        System.out.print(x + " ");
    }
}

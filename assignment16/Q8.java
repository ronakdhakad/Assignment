class Q8{
    public static void main(String[] args){
        int[] arr = new int[args.length];
        for(int i = 0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }}
        for(int n : arr){
            System.out.print(n +" " );
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}

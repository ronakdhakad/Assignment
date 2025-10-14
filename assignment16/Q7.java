// // 8) WAP showing the concept of Selection sort (Ascending order | Descending order)
// // 6) WAP showing the concept of Bubble sort  (Ascending order | Descending order)
class Q7{
    public static void main(String[] args){
       int arr[] = new int[args.length];
       for(int i = 0;i<args.length;i++){
        arr[i] = Integer.parseInt(args[i]); 
        }
         for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
        }
    }
        // int arrDesc[] = new int[args.length];
        // for(int i = 0; i < args.length; i++){
        //     arrDesc[i] = arr[i];
        // }

          

        // // Bubble Sort Descending
        // for(int i = 0; i < arrDesc.length - 1; i++){
        //     for(int j = 0; j < arrDesc.length - 1 - i; j++){
        //         if(arrDesc[j] < arrDesc[j+1]){
        //             int temp = arrDesc[j];
        //             arrDesc[j] = arrDesc[j+1];
        //             arrDesc[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.print("Descending Order: ");
        // for(int n : arrDesc){
        //     System.out.print(n + " ");
        // }
 

class Insertion{
    public static void main(String args[]){
        int input[]={12,6,326,87,2,2,15,90,443,22,41};
        System.out.println();
        int n=input.length;

        for(int i=1;i<n;i++){
            int key=input[i];
            int j=i-1;
            while(j>=0&&input[j]>key){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=key; 
        }
        for(int i=0;i<n;i++){
            System.out.print(input[i]+" ");
        }
    }
}
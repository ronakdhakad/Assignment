class SelectionSort{
    public static void main(String args[]){
        int input[]={12,6,326,87,2,2,15,90,443,22,41};
        System.out.println(input);
        int n=input.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(input[j]<input[i]){
                    int temp=input[j]+input[i];
                    input[j]=temp-input[j];
                    input[i]=temp-input[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(input[i]+" ");
        }
    }
}
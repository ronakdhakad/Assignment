//6. WAP to sort the array
//import java.util.Scanner;
class Arr6 {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number");
        //int n=sc.nextInt();
        //int data[]=new int[];
        int data[]={10,3,8,50,95,2,7,1};
        int swap;
        
        for(int i=0;i<data.length;i++){
        	for(int j=i+1;j<data.length;j++){
        		if(data[i]>data[j]){
        			swap=data[i]+data[j];
        			data[i]=data[j];
        			data[j]=swap-data[j];
        		}
        	}
        }
        for(int a=0;a<data.length;a++){
        	System.out.printf(data[a]+" ");
        }
    }
    
}

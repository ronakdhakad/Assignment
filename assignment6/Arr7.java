//7. WAP to search an element in array using binary search.
import java.util.Scanner;
class Arr7 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element");
		int num=sc.nextInt();
		int array[]={10,23,33,44,55,77,540};
		int n=array.length;
		boolean find=true;
		int low =0;
		int high=n-1;
		int mid;
		
		while(low <= high){
			mid=(low+high)/2;
			if(array[mid]==num){
				find=false;
				break;
			}else if(num > array[mid]){
				low= mid+1;
			}else{
				high = mid-1;
			}
		}
		if(!find)
			System.out.println("Element found");
		else
			System.out.println("Element is not found");
	}
}
			
    


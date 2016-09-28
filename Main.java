import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args){
		int[] a={-7,0,2,5,8,11,22};
		System.out.println(findI(a));
	}
	
	public static int findI2(int[] a,int low, int high){//not distinct values
		if(low>high)return -1;
		
		int mid=(low+high)/2;
		int midValue=a[mid];
		if(mid==midValue)return mid;
		
		//search left
		int leftIndex=Math.min(mid-1, midValue);
		int left=findI2(a,low,leftIndex);
		if(left>=0)return left;
		
		//search right
		int rightIndex=Math.max(mid+1, midValue);
		int right=findI2(a,rightIndex,high);
		return right;
	}
	
	public static int findI(int[] a){
		return findI(a,0,a.length-1);
	}
	
	public static int findI(int[] a, int low, int high){
		if(low>high)return -1;
		int mid=(low+high)/2;
		
		if(a[mid]>mid){
			return findI(a,low,mid-1);
		}else if(a[mid]<mid){
			return findI(a,mid+1,high);
		}else{
			return mid;
		}

		
	}

}

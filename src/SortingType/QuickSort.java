package SortingType;

public class QuickSort {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j< high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}//swap with pivot
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;//pivot index
		
	}

	public static void quicksort(int arr[],int low,int high) {
		if(low < high) {
			int pivotindex=partition(arr, low, high);
			quicksort(arr, low, pivotindex-1);
			quicksort(arr, pivotindex+1, high);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {6,3,9,5,2,8};
		int n= arr.length;
		
		quicksort(arr, 0, n-1);
		//print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

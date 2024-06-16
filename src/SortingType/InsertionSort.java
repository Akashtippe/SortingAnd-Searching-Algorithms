package SortingType;

public class InsertionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,12,2,1,5,13};
		//time complexity=o(n^2)
		//Insertion sort
		for(int i=1;i<arr.length;i++) {//unsorted array run
			int current=arr[i];//select current element
			int j=i-1;//sorted part last element
			while(j>=0 && current< arr[j]) {
				arr[j+1]=arr[j];
				j--;	
			}
			//placement if above condition is false then placed in right place
			arr[j+1]=current;
			
		}
      printArray(arr);
	}

}

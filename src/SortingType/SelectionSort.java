package SortingType;

public class SelectionSort {
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
		//selection sort
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {  //comparing from start 
				if(arr[smallest]> arr[j]) {
					smallest=j;	
				}	
			}
			//swap
			int temp=arr[smallest];  //smallest j put int i value
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
      printArray(arr);
	}


}

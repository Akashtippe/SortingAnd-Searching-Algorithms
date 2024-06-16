package SortingType;

public class BubbleSort {
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
		//bubble sort
		for(int i=0;i<arr.length-1;i++) { //array length reduce from last 
			for(int j=0;j<arr.length-i-1;j++) {  //i=0,1,... internal loop 
				if(arr[j]> arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
      printArray(arr);
	}

}
